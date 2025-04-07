package com.assistant.interviewer.service.quiz.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class QuizDto {
    private String uid;

    private String question;

    private String answer;
}