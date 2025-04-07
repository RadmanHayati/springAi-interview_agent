package com.assistant.interviewer.spec.response;

import com.assistant.interviewer.spec.dto.QuizDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class QuizzesResponse {
    List<QuizDto> quizzes;

}
