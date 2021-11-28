package tn.esprit.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Rayon {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column
private long idRayon;

@Column
String code;

@Column
String libelle;

@OneToMany(mappedBy="rayon")
private List<Produit> produits;



public Rayon() {
	super();
	// TODO Auto-generated constructor stub
}


}
