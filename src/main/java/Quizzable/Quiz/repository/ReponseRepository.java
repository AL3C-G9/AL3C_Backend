package Quizzable.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.Quiz.model.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository <Reponse,String>{

}
