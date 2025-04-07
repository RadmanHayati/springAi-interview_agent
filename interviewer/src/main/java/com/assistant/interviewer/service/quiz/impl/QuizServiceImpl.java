package com.assistant.interviewer.service.quiz.impl;

import com.assistant.interviewer.model.quiz.dao.QuizDao;
import com.assistant.interviewer.service.quiz.QuizService;
import com.assistant.interviewer.service.quiz.mapper.QuizServiceMapper;
import com.assistant.interviewer.service.quiz.model.QuizzesModel;
import com.assistant.interviewer.service.quiz.model.QuizzesResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final QuizServiceMapper mapper;

    private final QuizDao dao;
    @Override
    public QuizzesResult getQuizzes(QuizzesModel model) {
        return mapper.toQuizzesResult(dao.findByUserId(model.getUserId()));
    }
}
