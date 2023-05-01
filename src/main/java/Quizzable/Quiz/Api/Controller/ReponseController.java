package Quizzable.Quiz.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Quizzable.Quiz.Api.model.Reponse;
import Quizzable.Quiz.Service.ReponseService;

@RestController
public class ReponseController {
    @Autowired
    ReponseService reponseService;

    @Autowired
    public ReponseController(ReponseService reponseService){
        this.reponseService=reponseService;
    }

    @GetMapping(value = "/listeRep")
    public List<Reponse> getAllReponse() {
        return reponseService.getAllReponses();
    }

    @GetMapping(value = "/reponse")
    public Reponse getReponse(@RequestParam String idr) {
        return reponseService.getReponse(idr);
    }

}
