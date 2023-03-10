package Quizzable.Quiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Quizzable.Quiz.Service.QuestionService;
import Quizzable.Quiz.model.Question;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("question")
@CrossOrigin
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "/")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    @GetMapping(value = "")
    public Question getQuestion(@RequestParam String id) {
        return questionService.getQuestion(id);
    }

    @PostMapping(value = "path")
    public void saveQuestion(@RequestBody Question entity) {
        questionService.saveQuestion(entity);
    }

    @DeleteMapping(value = "")
    public void deleteQuention(@RequestParam String id) {
        questionService.deleteQuestion(id);
    }

}
