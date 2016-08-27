package com.yc.vote.services;

import java.util.List;

import com.yc.vote.entity.Subject;

public interface SubjectService {
	List<Subject> listAll();

	Subject findSubjectById(int vsId);
}
