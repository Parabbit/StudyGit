package com.yc.vote.services;

import java.util.List;

import com.yc.vote.entity.Option;

public interface OptionService {

	List<Option> findOptionById(int vsId);

}
