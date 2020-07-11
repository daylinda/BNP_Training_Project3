package com.quiz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizResultDAO;
import com.quiz.model.AnswerResponse;
import com.quiz.model.AnswerResult;
import com.quiz.model.Question;
import com.quiz.model.QuizResult;
import com.quiz.model.UserAnswers;
import com.quiz.service.AnswerService;
import com.quiz.service.QuestionService;
import com.quiz.service.QuizResultService;


@Service
public class AnswerServiceImpl implements AnswerService {
	
	@Autowired
	private QuestionService questionService;
	
	
	@Autowired
	private QuizResultService resultService;

	@Override
	public AnswerResult getResult(UserAnswers userAnswers) {
		
		List<Question> queList= questionService.getAllQuestions();
		
		AnswerResult ansResult = new AnswerResult();
		
		ansResult.setUserName(userAnswers.getUserName());
		int result = 0;
		
		List<AnswerResponse> ansResponseList= new ArrayList<>();
		for ( Question q: queList) {
			
			if(q.getAnswer().equals(userAnswers.getUserAnswersMap().get(q.getId()))) {
				result++;
				
			}
			AnswerResponse ansResponse=new AnswerResponse(q.getId(),
					userAnswers.getUserAnswersMap().get(q.getId()),q.getAnswer());
			
			ansResponseList.add(ansResponse);			
			
		}
		
		ansResult.setAnswerResponse(ansResponseList);
		ansResult.setResult(result);
		
		resultService.createQuizResult(new QuizResult(userAnswers.getUserName(),result));
		
		
		return ansResult;
	}
	
	
	
	

}
