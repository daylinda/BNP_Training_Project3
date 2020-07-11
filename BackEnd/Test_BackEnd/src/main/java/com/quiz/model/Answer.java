package com.quiz.model;



public class Answer {
	private int questionId;
	private String userAnswer;
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Answer(int questionId, String userAnswer) {
		
		this.questionId = questionId;
		this.userAnswer = userAnswer;
	}



	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	
	
	
	
}
