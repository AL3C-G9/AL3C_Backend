package Quizzable.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import Quizzable.model.Categorie;

public interface CategorieRepository extends JpaRepository <Categorie,Long>{
    
}
