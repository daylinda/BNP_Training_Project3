package com.quiz.model;

public class AnswerResponse {
	private int questionId;
	private String userAnswer;
	private String correctAnswer;
	public AnswerResponse() {
		// TODO Auto-generated constructor stub
	}
	public AnswerResponse(int questionId, String userAnswer, String correctAnswer) {

		this.questionId = questionId;
		this.userAnswer = userAnswer;
		this.correctAnswer = correctAnswer;
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
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

}
