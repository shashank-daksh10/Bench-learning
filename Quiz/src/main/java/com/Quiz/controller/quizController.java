package com.Quiz.controller;

import com.Quiz.models.Quiz;
import com.Quiz.service.questionClient;
import com.Quiz.service.quizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quiz/")
public class quizController {
    private quizService quizService;

    private questionClient questionClient;

    public quizController(com.Quiz.service.quizService quizService, com.Quiz.service.questionClient questionClient) {
        this.quizService = quizService;
        this.questionClient = questionClient;
    }

    @PostMapping("/save")
    public String addQuiz(@RequestBody Quiz quiz){
        quizService.add(quiz);
        return "Quiz Saved succesfully";

    }
    @GetMapping("/getAll")
    public List<Quiz> getAll(){
        List<Quiz>quizzes= quizService.getAll();
        quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.findAllQuestionByQuizId(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return quizzes;
    }
    @GetMapping("/find/{id}")
    public Quiz findById(@PathVariable long id){
        Quiz quiz= quizService.getById(id);
        if(Objects.nonNull(quiz)) {
            quiz.setQuestions(questionClient.findAllQuestionByQuizId(quiz.getId()));
            return quiz;
        }
        return null;
    }
}
