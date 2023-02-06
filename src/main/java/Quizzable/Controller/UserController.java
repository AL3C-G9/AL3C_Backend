package Quizzable.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Quizzable.Service.UserService;
import Quizzable.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {
    
    @Autowired
     UserService userService;

    @GetMapping(value="users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value="users/get")
    public User getUser(@RequestParam Long id) {
        return userService.getUser(id);
    }
    
    @PostMapping(value="users/add")
    public void saveUser(@RequestBody User entity) {
        userService.saveUser(entity);
    }
    

    @DeleteMapping(value = "users/delete")
    public void deleteUser(@RequestParam Long id){
         userService.deleteUser(id);
    }
    

}
