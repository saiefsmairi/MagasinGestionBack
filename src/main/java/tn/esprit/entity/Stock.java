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
@Entity
@Getter
@Setter
public class Stock {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column
private long idstock;

@Column
int qte;

@Column
int qteMin;

@Column
String libelleStock;

@OneToMany(mappedBy="stock")
private List<Produit> produits;


public Stock() {
	super();
	// TODO Auto-generated constructor stub
}


public Stock(int qte, int qteMin, String libelleStock) {
	super();
	this.qte = qte;
	this.qteMin = qteMin;
	this.libelleStock = libelleStock;
}


@Override
public String toString() {
	return "Stock [idstock=" + idstock + ", qte=" + qte + ", qteMin=" + qteMin + ", libelleStock=" + libelleStock
			+ ", produits=" + produits + "]";
}
 

}
