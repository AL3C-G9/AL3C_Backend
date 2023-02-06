package Quizzable.model;

import  javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Id;


@Entity
@Data
@Table(name="bataille")
public class Bataille {
    
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;

}
