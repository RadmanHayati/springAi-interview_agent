package com.assistant.interviewer.service.quiz;

import com.assistant.interviewer.service.quiz.model.QuizzesModel;
import com.assistant.interviewer.service.quiz.model.QuizzesResult;

public interface QuizService {
    QuizzesResult getQuizzes(QuizzesModel model);
}
