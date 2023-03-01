package Quizzable.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Quizzable.Quiz.Service.CategorieService;
import Quizzable.Quiz.Service.QuestionService;
import Quizzable.Quiz.Service.ReponseService;
import Quizzable.Quiz.Service.ReponsesCorrectesService;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner {

	@Autowired
	private CategorieService categorieService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private ReponseService reponseService;
	@Autowired
	private ReponsesCorrectesService repcorrectesService;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categorieService.loadCategorieData();
		// questionService.loadQuestionData();
		// reponseService.loadReponseData();
		// repcorrectesService.loadReponseCorrecteData() ;
		//hey
	}

}