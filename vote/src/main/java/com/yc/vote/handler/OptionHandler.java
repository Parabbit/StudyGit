package com.yc.vote.handler;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.vote.entity.Option;
import com.yc.vote.services.OptionService;

@Controller
@RequestMapping("/option")
public class OptionHandler {

	@Autowired
	private OptionService optionService;
	
	@RequestMapping("/show")
	public void show(int vsId,PrintWriter out){
		List<Option> options=optionService.findOptionById(vsId);
		out.println(options);
		out.flush();
		out.close();
	}
}
