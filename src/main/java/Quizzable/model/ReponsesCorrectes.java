package Quizzable.model;

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
@Table(name = "reponseCorrectes")
public class ReponsesCorrectes {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idR;

    @Id
    private String idQ;

    public String getIdR() {
        return idR;
    }

    public String getIdQ() {
        return idQ;
    }

    @OneToOne
    @JoinColumn(name = "idQ")
    private Question question;

    @OneToOne
    @JoinColumn(name = "idR")
    private Reponse reponse;
}
