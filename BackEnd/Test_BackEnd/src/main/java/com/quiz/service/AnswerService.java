package com.quiz.service;

import java.util.List;

import com.quiz.model.AnswerResponse;
import com.quiz.model.UserAnswers;

public interface AnswerService {
	
	public List<AnswerResponse> getResult(UserAnswers userAnswers);

}
