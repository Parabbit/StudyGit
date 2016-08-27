package com.yc.vote.mapper;

import java.util.List;

import com.yc.vote.entity.User;

public interface UserMapper {
	List<User> findAllVoteUser();

	int insertUser(User user);

	User findUserByNP(User user);
}
