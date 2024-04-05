package com.Question.repository;

import com.Question.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface questionRepository extends JpaRepository<Question,Long> {

    public List<Question> findByQuizId(Long id);
}
