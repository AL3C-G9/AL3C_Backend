package Quizzable.Quiz.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categorie")
public class Categorie {

    @Id
    private String idC;

    @Column(name = "nomCat")
    private String nomCat;

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    public String getCategorie() {
        return nomCat;
    }

    public void setCategorie(String categorie) {
        this.nomCat = nomCat;
    }

    @OneToMany(mappedBy = "categorie")
    private List<Question> questions;

}
