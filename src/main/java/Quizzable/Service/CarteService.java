package Quizzable.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.repository.CarteRepository;

@Service
public class CarteService {

    @Autowired
    CarteRepository carteRepository;
    
}
