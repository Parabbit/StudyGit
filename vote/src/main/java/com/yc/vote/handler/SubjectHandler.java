package com.yc.vote.handler;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.yc.vote.entity.Subject;
import com.yc.vote.services.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectHandler {
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/listAll")
	public void listAll(PrintWriter out){
		System.out.println("yes");
		List<Subject> subjects=subjectService.listAll();
		Gson gson=new Gson();
		System.out.println(subjects);
		out.println(gson.toJson(subjects));
		out.flush();
		out.close();
	}
	@RequestMapping("/view")
	private String view(int vsId,ModelMap map){
		Subject subject=subjectService.findSubjectById(vsId);
		map.put("subject",subject);
		return "view";
	}
}
