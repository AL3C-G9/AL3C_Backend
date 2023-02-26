package Quizzable.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Quizzable.model.Reponse;
import Quizzable.repository.ReponseRepository;

@Service
public class ReponseService {
    
    @Autowired
    ReponseRepository reponseRepository;

   public List<Reponse> getAllReponses(){
      return reponseRepository.findAll();
   }

   public Reponse getReponse(Long id){
     return reponseRepository.findById(id).get();
   }


   public void saveReponse(Reponse reponse){
      reponseRepository.save(reponse);
   }


   public void  deleteReponse(Long id){
    reponseRepository.deleteById(id);
   }
}
