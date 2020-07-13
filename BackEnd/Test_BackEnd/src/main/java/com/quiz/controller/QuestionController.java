package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.Question;
import com.quiz.service.QuestionService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuestionController {
	@Autowired
	private QuestionService service;
	
//	@PostMapping("/question")
//	public Question createQuestion(@RequestBody Question question) {
//
//		return service.createQuestions(question);
//	}
	
	@GetMapping("/questions")
	public List<Question> getAllQuestions() {

		return service.getAllQuestions();
	}

	
	

}
