package Quizzable.Quiz.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.Quiz.repository.BatailleRepository;

@Service
public class BatailleService  {

    @Autowired
    BatailleRepository batailleRepository;
    

    
}
