package Quizzable.Quiz.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.Quiz.repository.ReponseRepository;
import Quizzable.Quiz.model.Reponse;

@Service
public class ReponseService {
    
    @Autowired
    ReponseRepository reponseRepository;

   public List<Reponse> getAllReponses(){
      return reponseRepository.findAll();
   }

   public Reponse getReponse(String id){
     return reponseRepository.findById(id).get();
   }


   public void saveReponse(Reponse reponse){
      reponseRepository.save(reponse);
   }


   public void  deleteReponse(String id){
    reponseRepository.deleteById(id);
   }
}
