package Quizzable.Quiz.Service;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import Quizzable.Quiz.repository.ReponsesCorrectesRepository;
import Quizzable.Quiz.model.ReponsesCorrectes;

@Service 
public class ReponsesCorrectesService {
    @Autowired
    ReponsesCorrectesRepository ReponsesCorrectesRepository;

   public List<ReponsesCorrectes> getAllReponsesCorrectes(){
      return ReponsesCorrectesRepository.findAll();
   }

   public ReponsesCorrectes getReponsesCorrectes(String id){
     return ReponsesCorrectesRepository.findById(id).get();
   }

   public void saveReponsesCorrectes(ReponsesCorrectes ReponsesCorrectes){
      ReponsesCorrectesRepository.save(ReponsesCorrectes);
   }

   public void  deleteReponsesCorrectes(String id){
    ReponsesCorrectesRepository.deleteById(id);
   }
    
}
