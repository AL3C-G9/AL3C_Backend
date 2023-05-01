package Quizzable.Quiz.Api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "reponse")
public class Reponse {

    @Id
    private String idR;

    @Column(name = "reponse")
    private String rep;

    public String getIdR() {
        return idR;
    }

    public void setIdR(String idR) {
        this.idR = idR;
    }

    public String getReponse() {
        return rep;
    }

    public void setReponse(String reponse) {
        this.rep = reponse;
    }

    @ManyToOne
    private Question question;

    //@OneToOne
    //private ReponsesCorrectes reponseCorrecte;

}