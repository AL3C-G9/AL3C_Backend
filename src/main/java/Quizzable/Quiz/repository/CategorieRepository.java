package Quizzable.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.Quiz.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository <Categorie,String>{
    
}
