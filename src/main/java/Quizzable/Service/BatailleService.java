package Quizzable.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.repository.BatailleRepository;

@Service
public class BatailleService  {

    @Autowired
    BatailleRepository batailleRepository;
    

    
}
