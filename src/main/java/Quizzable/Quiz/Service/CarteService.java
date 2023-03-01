package Quizzable.Quiz.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.Quiz.repository.CarteRepository;

@Service
public class CarteService {

    @Autowired
    CarteRepository carteRepository;
    
}
