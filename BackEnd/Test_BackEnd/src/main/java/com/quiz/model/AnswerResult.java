package com.quiz.model;

import java.util.List;

public class AnswerResult {
	
	private String userName;
	private int result;
	List<AnswerResponse> answerResponses;
	
	public AnswerResult() {
		// TODO Auto-generated constructor stub
	}

	public AnswerResult(String userName, int result, List<AnswerResponse> answerResponse) {
	
		this.userName = userName;
		this.result = result;
		this.answerResponses = answerResponse;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public List<AnswerResponse> getAnswerResponse() {
		return answerResponses;
	}

	public void setAnswerResponse(List<AnswerResponse> answerResponse) {
		this.answerResponses = answerResponse;
	}
	

}
