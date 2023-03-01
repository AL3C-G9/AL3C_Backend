package Quizzable.Quiz.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.Quiz.repository.UserRepository;
import Quizzable.Quiz.model.User;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User getUser( Long id) {
        return userRepository.findById(id).get();
    }
    

    public void saveUser(User entity) {
        userRepository.save(entity);
    }
    


    public void deleteUser( Long id){
        userRepository.deleteById(id);
    }
    
}
