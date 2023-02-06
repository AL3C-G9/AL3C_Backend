package Quizzable.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
@Table(name="question")
public class Question {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column
    private String question;
    
    @Column
    private String reponse;


    @OneToMany(mappedBy = "question_id", cascade = CascadeType.ALL )
    List<Respons> respons;


    @ManyToOne
    private Categorie categorie;

}
