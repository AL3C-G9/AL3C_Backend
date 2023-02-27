package Quizzable.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
@Table(name="question")
public class Question {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idQ;
    
    @Column(name = "question")
    private String question;
    
    public Long getIdQ() {
        return idQ;
    }

    public void setIdQ(Long idQ) {
        this.idQ = idQ;
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @ManyToOne
    @JoinColumn(name = "idC")
    private Categorie categorie;


}
