package Quizzable.Quiz.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.Quiz.Api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
