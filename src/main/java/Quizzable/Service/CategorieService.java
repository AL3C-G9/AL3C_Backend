package Quizzable.Service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import Quizzable.model.Categorie;
import Quizzable.repository.CategorieRepository;
import io.micrometer.core.instrument.util.IOUtils;
import jakarta.annotation.Resource;

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

   private JdbcTemplate jdbcTemplate;
   public void loadUserData() throws ScriptException, SQLException {
        Resource resource = (Resource) new ClassPathResource("insert_categorie.sql");
            try {
                jdbcTemplate.execute(IOUtils.toString(((ClassPathResource) resource).getInputStream(), StandardCharsets.UTF_8));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
      }

    
        
}


