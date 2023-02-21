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
    private Long idR;

    @Id
    private Long idQ;

    public Long getIdR() {
        return idR;
    }

    public Long getIdQ() {
        return idQ;
    }

    @OneToOne
    @JoinColumn(name = "idQ")
    private Question question;

    @OneToOne
    @JoinColumn(name = "idR")
    private Reponse reponse;
}
