package com.quiz.populator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.Question;
import com.quiz.service.QuestionService;

@Service
public class QuestionPopulator {
	
	@Autowired
	private QuestionService service;
	
	private static int flag=0; 
	
	public void questionPopulator(){
		
		if(flag==1) return;
		
		Question q1 = new Question("What is the square root of 4?","2");
		Question q2 = new Question("What is the capital of India?","New Delhi");
		Question q3 = new Question("What is the capita of USA?","Washington DC");
		Question q4 = new Question("Who won FIFA 2018 World Cup?","France");
		
		
		service.createQuestions(q1);
		service.createQuestions(q2);
		service.createQuestions(q3);
		service.createQuestions(q4);
		
		flag=1;
		
	}

}
