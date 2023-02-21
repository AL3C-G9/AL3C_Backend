package Quizzable.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "categorie")
public class Categorie {
    

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idC;

    @Column(name = "nomCat")
    private String categorie;

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }
    
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


    @OneToMany(mappedBy = "categorie_id")
    private List<Question> questions;

}
