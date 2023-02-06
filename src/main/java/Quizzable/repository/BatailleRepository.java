package Quizzable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Quizzable.model.Bataille;

public interface BatailleRepository extends JpaRepository<Bataille,Long>{
    
}
