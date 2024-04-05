package com.Question.service.impl;

import com.Question.models.Question;
import com.Question.repository.questionRepository;
import com.Question.service.questionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class questionServiceImpl implements questionService {
    private questionRepository questionRepository;

    public questionServiceImpl(com.Question.repository.questionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findOne(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Question> findByQuizId(Long id) {
        return questionRepository.findByQuizId(id);
    }
}
