package Quizzable.Quiz.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quizzable.Quiz.repository.QuestionRepository;
import Quizzable.Quiz.model.Question;

@Service
public class QuestionService {
    
    @Autowired
    QuestionRepository questionRepository;

   public List<Question> getAllQuestion(){
      return questionRepository.findAll();
   }

   public Question getQuestion(String id){
     return questionRepository.findById(id).get();
   }


   public void saveQuestion(Question question){
      questionRepository.save(question);
   }


   public void  deleteQuestion(String id){
    questionRepository.deleteById(id);
   }

}
