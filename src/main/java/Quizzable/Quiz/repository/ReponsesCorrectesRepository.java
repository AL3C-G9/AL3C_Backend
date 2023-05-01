package Quizzable.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.Quiz.Api.model.ReponsesCorrectes;

@Repository
public interface ReponsesCorrectesRepository extends JpaRepository <ReponsesCorrectes,String> {
    
}
