package com.quiz.service;

import java.util.List;

import com.quiz.model.Question;



public interface QuestionService {
	
	public Question createQuestions(Question question);
	public List<Question> getAllQuestions();

}
