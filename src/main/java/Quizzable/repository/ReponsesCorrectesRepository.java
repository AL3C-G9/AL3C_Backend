package Quizzable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Quizzable.model.ReponsesCorrectes;

public interface ReponsesCorrectesRepository extends JpaRepository <ReponsesCorrectes,Long> {
    
}
