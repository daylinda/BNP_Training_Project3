package com.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuestionDAO;
import com.quiz.model.Question;
import com.quiz.service.QuestionService;
@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionDAO dao;

	@Override
	public Question createQuestions(Question question) {
		
		return dao.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		
		return dao.findAll();
	}

}
