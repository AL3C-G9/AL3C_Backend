package Quizzable.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.Quiz.Api.model.Bataille;

@Repository
public interface BatailleRepository extends JpaRepository<Bataille,Long>{
    
}
