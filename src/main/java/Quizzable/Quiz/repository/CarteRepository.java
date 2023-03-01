package Quizzable.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.Quiz.model.Carte;

@Repository
public interface CarteRepository extends JpaRepository<Carte, String>{

    
    
}