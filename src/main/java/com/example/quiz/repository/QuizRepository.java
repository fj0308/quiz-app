package com.example.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.Quiz;

/** Quizテーブル　:RepojitoryImpl */
@Repository
public interface QuizRepository extends CrudRepository<Quiz,Integer>{

}