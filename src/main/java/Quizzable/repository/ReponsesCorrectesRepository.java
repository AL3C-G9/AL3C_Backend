package Quizzable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.model.ReponsesCorrectes;

@Repository
public interface ReponsesCorrectesRepository extends JpaRepository <ReponsesCorrectes,String> {
    
}
