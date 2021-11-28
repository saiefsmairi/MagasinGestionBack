package tn.esprit.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategorieProduit {
	
@Id 
private long id;

@Column 
private String name;

@OneToOne(mappedBy="categorieProduit")
private Produit produit;
}
