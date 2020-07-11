package com.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.QuizResult;

@Repository
public interface QuizResultDAO extends JpaRepository<QuizResult,Integer>{

}
