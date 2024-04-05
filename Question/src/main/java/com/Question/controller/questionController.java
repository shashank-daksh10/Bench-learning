package com.Question.controller;

import com.Question.models.Question;
import com.Question.service.questionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class questionController {
    private questionService questionService;

    public questionController(com.Question.service.questionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping("/save")
    public String saveQuestion(@RequestBody Question question){
        questionService.save(question);
        return "Question Saved successfully";

    }
    @GetMapping("/getAll")
    public List<Question> getAll(){
        return questionService.findAll();
    }

    @GetMapping("/find/{id}")
    public Question findOne(@PathVariable Long id){
        return questionService.findOne(id);
    }

    @GetMapping("/findByQuiz/{quizId}")
    public List<Question>findByQuizId(@PathVariable Long quizId){
        return questionService.findByQuizId(quizId);
    }
}
