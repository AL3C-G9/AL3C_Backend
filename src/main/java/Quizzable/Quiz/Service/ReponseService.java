package Quizzable.Quiz.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import Quizzable.Quiz.Api.model.Reponse;
import Quizzable.Quiz.repository.ReponseRepository;
import io.micrometer.core.instrument.util.IOUtils;

@Service
public class ReponseService {

   @Autowired
   ReponseRepository reponseRepository;

   @Autowired
   private JdbcTemplate jdbcTemplate;

   public List<Reponse> getAllReponses() {
      return reponseRepository.findAll();
   }

   public Reponse getReponse(String id) {
      return reponseRepository.findById(id).get();
   }

   public void saveReponse(Reponse reponse) {
      reponseRepository.save(reponse);
   }

   public void deleteReponse(String id) {
      reponseRepository.deleteById(id);
   }

   public void loadReponseData() throws ScriptException, SQLException {
      Resource resource = new ClassPathResource("insert_reponse.sql");
      try {
         jdbcTemplate
               .execute(IOUtils.toString(((ClassPathResource) resource).getInputStream(), StandardCharsets.UTF_8));
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }
}