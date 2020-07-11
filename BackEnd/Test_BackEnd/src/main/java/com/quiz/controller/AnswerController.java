package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.AnswerResult;
import com.quiz.model.QuizResult;
import com.quiz.model.UserAnswers;
import com.quiz.populator.QuestionPopulator;
import com.quiz.service.AnswerService;
import com.quiz.service.QuizResultService;

@RestController
public class AnswerController {
	
	@Autowired
	private AnswerService service;
	
	@Autowired
	private QuizResultService resultService;
	
	@Autowired
	private QuestionPopulator questionPopulator;
	
	@PostMapping("/answers")
	public  AnswerResult getResult(@RequestBody UserAnswers userAnswers) {
		
		questionPopulator.questionPopulator();
		
		
		return service.getResult(userAnswers);
		
	}
	
	@GetMapping("/quizresults")
	public List<QuizResult> getAllQuizResults(){
		
		return resultService.getAllQuizResults();
		
		
		
	}

}
