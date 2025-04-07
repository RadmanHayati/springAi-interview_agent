package com.assistant.interviewer.service.quiz.mapper;

import com.assistant.interviewer.model.quiz.Quiz;
import com.assistant.interviewer.service.quiz.model.QuizDto;
import com.assistant.interviewer.service.quiz.model.QuizzesResult;
import com.assistant.interviewer.util.UidProvider;
import org.mapstruct.*;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE, imports = { UidProvider.class })
public interface QuizServiceMapper {
    @Mapping(target= "uid", source="uid")
    @Mapping(target= "question", source="question")
    @Mapping(target= "answer", source="answer")
    QuizDto toQuizDto(Quiz quiz);

    default QuizzesResult toQuizzesResult(List<Quiz> quizzes) {
        List<QuizDto> quizDtos = quizzes.stream()
                .map(this::toQuizDto)
                .collect(Collectors.toList());
        QuizzesResult quizzesResult = new QuizzesResult();
        quizzesResult.setQuizzes(quizDtos);
        return quizzesResult;
    }

}
