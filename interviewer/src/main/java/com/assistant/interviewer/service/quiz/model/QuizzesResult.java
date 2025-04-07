package com.assistant.interviewer.service.quiz.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class QuizzesResult {
    List<QuizDto> quizzes;
}
