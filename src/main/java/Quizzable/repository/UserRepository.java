package Quizzable.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import Quizzable.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
