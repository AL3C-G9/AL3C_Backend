package Quizzable.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import Quizzable.model.Categorie;
import Quizzable.repository.CategorieRepository;

@Service
public class CategorieService {
    @Autowired
    CategorieRepository CategorieRepository;

   public List<Categorie> getAllCategorie(){
      return CategorieRepository.findAll();
   }

   public Categorie getCategorie(Long id){
     return CategorieRepository.findById(id).get();
   }


   public void saveCategorie(Categorie Categorie){
      CategorieRepository.save(Categorie);
   }


   public void  deleteCategorie(Long id){
    CategorieRepository.deleteById(id);
   }
}
