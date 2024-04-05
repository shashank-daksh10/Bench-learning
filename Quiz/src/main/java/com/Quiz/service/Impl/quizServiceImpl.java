package com.Quiz.service.Impl;

import com.Quiz.models.Quiz;
import com.Quiz.repository.quizRepository;
import com.Quiz.service.quizService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class quizServiceImpl implements quizService {

    private quizRepository quizRepository;

    public quizServiceImpl(com.Quiz.repository.quizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }
}
