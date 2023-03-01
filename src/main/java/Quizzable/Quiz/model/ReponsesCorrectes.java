package Quizzable.Quiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "reponseCorrectes")

public class ReponsesCorrectes {

    @Id
    private String idRC;

    @OneToOne
    @JoinColumn(name = "idQ")
    private Question question;
    @OneToOne
    @JoinColumn(name = "idR")
    private Reponse reponse;

}