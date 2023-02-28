package Quizzable.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
