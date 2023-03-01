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

import Quizzable.Quiz.repository.QuestionRepository;
import io.micrometer.core.instrument.util.IOUtils;
import Quizzable.Quiz.model.Question;

@Service
public class QuestionService {

   @Autowired
   QuestionRepository questionRepository;

   @Autowired
   private JdbcTemplate jdbcTemplate;

   public List<Question> getAllQuestion() {
      return questionRepository.findAll();
   }

   public Question getQuestion(String id) {
      return questionRepository.findById(id).get();
   }

   public void saveQuestion(Question question) {
      questionRepository.save(question);
   }

   public void deleteQuestion(String id) {
      questionRepository.deleteById(id);
   }

   public void loadQuestionData() throws ScriptException, SQLException {
      Resource resource = new ClassPathResource("insert_question.sql");
      try {
         jdbcTemplate
               .execute(IOUtils.toString(((ClassPathResource) resource).getInputStream(), StandardCharsets.UTF_8));
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }

}