package com.yc.vote.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.Option;
import com.yc.vote.mapper.OptionMapper;
import com.yc.vote.services.OptionService;

@Service("optionService")
public class OptionServiceImpl implements OptionService {

	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public List<Option> findOptionById(int vsId) {
		return optionMapper.getOptionById(vsId);
	}

}
