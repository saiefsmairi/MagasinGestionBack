package tn.esprit.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity

@NoArgsConstructor
@Getter
@Setter
public class Promotion {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column
	private long id;
	
	@Column
	String name;

	@Column
	Float pourcentage;

	@Column
	String description;
	
	
	@Column
	Date startDate;
	
	@Column
	Date endate;
	
	@OneToOne
	@JsonBackReference
	Produit product;
	

}
