package com.Quiz.repository;

import com.Quiz.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface quizRepository extends JpaRepository<Quiz,Long> {
}
