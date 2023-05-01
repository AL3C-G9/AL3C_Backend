package Quizzable.Quiz.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Quizzable.Quiz.Api.model.Categorie;
import Quizzable.Quiz.Service.CategorieService;

@RestController
public class CategorieController {
    @Autowired
    CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService){
        this.categorieService=categorieService;
    }

    @GetMapping(value = "/listeCat")
    public List<Categorie> getAllCategorie() {
        return categorieService.getAllCategorie();
    }

    @GetMapping(value = "/categorie")
    public Categorie getCategorie(@RequestParam String idc) {
        return categorieService.getCategorie(idc);
    }
}
