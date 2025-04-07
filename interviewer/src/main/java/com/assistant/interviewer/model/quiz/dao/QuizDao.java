package com.assistant.interviewer.model.quiz.dao;

import com.assistant.interviewer.model.quiz.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizDao extends MongoRepository<Quiz,Long> {
    List<Quiz> findByUserId(String userId);
}
