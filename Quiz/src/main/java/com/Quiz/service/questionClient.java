package com.Quiz.service;

import com.Quiz.models.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICE")
public interface questionClient {

    @GetMapping("/question/findByQuiz/{quizId}")
    List<Question>findAllQuestionByQuizId(@PathVariable Long quizId);
}
