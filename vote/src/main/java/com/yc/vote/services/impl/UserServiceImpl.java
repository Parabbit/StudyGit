package com.yc.vote.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.User;
import com.yc.vote.mapper.UserMapper;
import com.yc.vote.services.UserService;
import com.yc.vote.utils.Encrypt;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public boolean register(User user) {
		if(userMapper.insertUser(user)>0){
			return true;
		}
		return false;
	}
	@Override
	public User login(User user) {
		user.setVuPassword(Encrypt.md5AndSha(user.getVuPassword()));
		return userMapper.findUserByNP(user);
	}

}
