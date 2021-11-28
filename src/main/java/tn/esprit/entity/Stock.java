package tn.esprit.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column
private long idstock;

@Column
int quantite;
@Column
String size;
@Column
String color;
@OneToMany(mappedBy="stock")
private List<Produit> produits;






 

}
