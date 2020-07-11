package com.quiz.model;


import java.util.Map;

public class UserAnswers {
	private String userName;
	private Map<Integer,String> userAnswersMap;
	
	public UserAnswers() {
		// TODO Auto-generated constructor stub
	}

	public UserAnswers(String userName, Map<Integer, String> userAnswersMap) {
		
		this.userName = userName;
		this.userAnswersMap = userAnswersMap;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<Integer, String> getUserAnswersMap() {
		return userAnswersMap;
	}

	public void setUserAnswersMap(Map<Integer, String> userAnswersMap) {
		this.userAnswersMap = userAnswersMap;
	}
	
	
}
