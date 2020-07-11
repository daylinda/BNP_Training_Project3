package com.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizResultDAO;
import com.quiz.model.QuizResult;
import com.quiz.service.QuizResultService;

@Service
public class QuizResultServiceImpl implements QuizResultService {
	
	@Autowired
	private QuizResultDAO resultDao;
	
	public void createQuizResult(QuizResult qresult) {
		resultDao.save(qresult);
	}

	public List<QuizResult> getAllQuizResults(){
		
		return resultDao.findAll();
		
	}


}
