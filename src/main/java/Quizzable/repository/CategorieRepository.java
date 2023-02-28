package Quizzable.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quizzable.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository <Categorie,String>{
    
}
