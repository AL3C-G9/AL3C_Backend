package Quizzable.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.model.Question;
import Quizzable.repository.QuestionRepository;

@Service
public class QuestionService {
    
    @Autowired
    QuestionRepository questionRepository;

   public List<Question> getAllQuestion(){
      return questionRepository.findAll();
   }

   public Question getQuestion(Long id){
     return questionRepository.findById(id).get();
   }


   public void saveQuestion(Question question){
      questionRepository.save(question);
   }


   public void  deleteQuestion(Long id){
    questionRepository.deleteById(id);
   }

}
