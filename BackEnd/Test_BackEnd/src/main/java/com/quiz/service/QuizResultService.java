package com.quiz.service;

import java.util.List;

import com.quiz.model.QuizResult;

public interface QuizResultService {
	
	
	public void createQuizResult(QuizResult qresult);
	
	public List<QuizResult> getAllQuizResults();

}
