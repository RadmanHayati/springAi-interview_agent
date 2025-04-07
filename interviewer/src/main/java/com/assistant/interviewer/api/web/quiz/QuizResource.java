package com.assistant.interviewer.api.web.quiz;

import com.assistant.interviewer.api.web.quiz.mapper.QuizResourceMapper;
import com.assistant.interviewer.service.quiz.QuizService;
import com.assistant.interviewer.spec.response.QuizzesResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/quizzes")
@RequiredArgsConstructor
public class QuizResource {
    private final QuizService quizService;

    private final QuizResourceMapper mapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<QuizzesResponse> getQuizzes(@Valid @RequestBody String userId) {
        var destinationResult = quizService.getQuizzes(mapper.toQuizzesModel(userId));
        return ResponseEntity.ok(mapper.toQuizzesResponse(destinationResult));
    }

}

