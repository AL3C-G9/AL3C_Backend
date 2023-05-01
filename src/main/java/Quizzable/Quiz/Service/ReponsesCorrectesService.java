package Quizzable.Quiz.Service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

import Quizzable.Quiz.Api.model.ReponsesCorrectes;
import Quizzable.Quiz.repository.ReponsesCorrectesRepository;
import io.micrometer.core.instrument.util.IOUtils;

@Service
public class ReponsesCorrectesService {
   @Autowired
   ReponsesCorrectesRepository ReponsesCorrectesRepository;

   @Autowired
   private JdbcTemplate jdbcTemplate;

   public List<ReponsesCorrectes> getAllReponsesCorrectes() {
      return ReponsesCorrectesRepository.findAll();
   }

   public ReponsesCorrectes getReponsesCorrectes(String id) {
      return ReponsesCorrectesRepository.findById(id).get();
   }

   public void saveReponsesCorrectes(ReponsesCorrectes ReponsesCorrectes) {
      ReponsesCorrectesRepository.save(ReponsesCorrectes);
   }

   public void deleteReponsesCorrectes(String id) {
      ReponsesCorrectesRepository.deleteById(id);
   }

   public void loadReponseCorrecteData() throws ScriptException, SQLException {
      Resource resource = new ClassPathResource("insert_reponsecorrecte.sql");
      try {
         jdbcTemplate
               .execute(IOUtils.toString(((ClassPathResource) resource).getInputStream(), StandardCharsets.UTF_8));
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }

}