package com.assistant.interviewer.api.web.quiz.mapper;

import com.assistant.interviewer.service.quiz.model.QuizzesModel;
import com.assistant.interviewer.service.quiz.model.QuizzesResult;
import com.assistant.interviewer.spec.response.QuizzesResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuizResourceMapper {
    @Mapping(target = "userId", source = "userId")
    QuizzesModel toQuizzesModel(String userId);

    @Mapping(target = "quizzes", source = "quizzes")
    QuizzesResponse toQuizzesResponse(QuizzesResult result);
}
