package com.Quiz.service;

import com.Quiz.models.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface quizService {

    Quiz add(Quiz quiz);

    List<Quiz>getAll();

    Quiz getById(Long id);
}
