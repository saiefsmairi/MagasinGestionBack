package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
	@Query("SELECT sum(df.prixTotal*df.qte) FROM detailFacture df where df.produit=:produit and df.facture.dateFacture between :startDate and :endDate ")
	float getRevenuBrutProduit(@Param("produit") Produit produit,@Param("startDate") Date startDate ,@Param("endDate") Date endDate );
	
	
	  /*@Query(value = "SELECT p FROM Produit p JOIN p.stock s WHERE s.qte<s.qteMin ")
	    List<Produit> retrieveStatusStock();*/

}
