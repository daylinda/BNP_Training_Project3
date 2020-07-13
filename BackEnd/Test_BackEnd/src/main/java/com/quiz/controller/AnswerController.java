package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.AnswerResponse;
import com.quiz.model.QuizResult;
import com.quiz.model.UserAnswers;
import com.quiz.populator.QuestionPopulator;
import com.quiz.service.AnswerService;
import com.quiz.service.QuizResultService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnswerController {
	
	@Autowired
	private AnswerService service;
	
	@Autowired
	private QuizResultService resultService;
	
	@Autowired
	private QuestionPopulator questionPopulator;
	
	@PostMapping("/answers")
	public  List<AnswerResponse> getResult(@RequestBody UserAnswers userAnswer) {
		
		System.out.println(userAnswer.getUserName());
		System.out.println(userAnswer.getUserAnswersMap().get(1));
		questionPopulator.questionPopulator();
		
		
		return service.getResult(userAnswer);
		
	}
	
	@GetMapping("/quizresults")
	public List<QuizResult> getAllQuizResults(){
		
		return resultService.getAllQuizResults();
		
		
		
	}

}
