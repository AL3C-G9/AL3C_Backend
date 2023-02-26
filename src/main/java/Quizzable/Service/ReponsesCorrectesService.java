package Quizzable.Service;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import Quizzable.model.ReponsesCorrectes;
import Quizzable.repository.ReponsesCorrectesRepository;

@Service 
public class ReponsesCorrectesService {
    @Autowired
    ReponsesCorrectesRepository ReponsesCorrectesRepository;

   public List<ReponsesCorrectes> getAllReponsesCorrectes(){
      return ReponsesCorrectesRepository.findAll();
   }

   public ReponsesCorrectes getReponsesCorrectes(Long id){
     return ReponsesCorrectesRepository.findById(id).get();
   }

   public void saveReponsesCorrectes(ReponsesCorrectes ReponsesCorrectes){
      ReponsesCorrectesRepository.save(ReponsesCorrectes);
   }

   public void  deleteReponsesCorrectes(Long id){
    ReponsesCorrectesRepository.deleteById(id);
   }
    
}
