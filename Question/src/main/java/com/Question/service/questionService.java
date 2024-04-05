package com.Question.service;

import com.Question.models.Question;

import java.util.List;

public interface questionService {

    Question save(Question question);

    List<Question>findAll();

    Question findOne(Long id);

    List<Question>findByQuizId(Long id);
}
