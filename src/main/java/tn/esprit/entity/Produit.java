package tn.esprit.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.JoinColumn;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column
private long idproduit;
@Column
String title;
@Column
Float price;
@Column
String description;
@Column
String picture;
@Column
Date createdAt;
@Column 
Date updatedAt;
@ManyToOne
private Stock stock;
@OneToOne
private CategorieProduit categorieProduit;

@ManyToOne
private Rayon rayon;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "idFacture")
private List<detailFacture> detailFactures;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "T_PRODUIT_FOURNISSEUR",joinColumns={@JoinColumn(name="idproduit")},inverseJoinColumns={@JoinColumn(name ="idFournisseur")})
private Set<Fournisseur> fournisseurs;




}
