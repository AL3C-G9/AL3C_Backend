package Quizzable.Quiz.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Quizzable.Quiz.Api.model.ReponsesCorrectes;
import Quizzable.Quiz.Service.ReponsesCorrectesService;

@RestController
public class ReponsesCorrectesController {

    @Autowired
    ReponsesCorrectesService rcService;

    @Autowired
    public ReponsesCorrectesController(ReponsesCorrectesService reponseService){
        this.rcService=reponseService;
    }

    @GetMapping(value = "/listeRC")
    public List<ReponsesCorrectes> getAllReponsesCorrectes() {
        return rcService.getAllReponsesCorrectes();
    }

    @GetMapping(value = "/reponsecorrecte")
    public ReponsesCorrectes getReponsesCorrectes(@RequestParam String idrc) {
        return rcService.getReponsesCorrectes(idrc);
    }

    
}
