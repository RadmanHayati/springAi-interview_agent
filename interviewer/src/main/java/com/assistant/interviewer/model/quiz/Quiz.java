package com.assistant.interviewer.model.quiz;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@ToString(callSuper = true)
@Document(collection = "quizzes")
public class Quiz {
    @Indexed(unique = true)
    private String uid;

    private String userId;

    private String question;

    private String answer;
}
