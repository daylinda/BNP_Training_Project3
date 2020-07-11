package com.quiz.service;

import com.quiz.model.AnswerResult;
import com.quiz.model.UserAnswers;

public interface AnswerService {
	
	public AnswerResult getResult(UserAnswers userAnswers);

}
