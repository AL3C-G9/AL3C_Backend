package Quizzable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Quizzable.model.Question;

public interface QuestionRepository  extends JpaRepository<Question,Long>{
    
}
