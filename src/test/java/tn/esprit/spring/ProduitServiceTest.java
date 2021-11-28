package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entity.Client;
import tn.esprit.entity.Facture;
import tn.esprit.entity.Produit;
import tn.esprit.spring.service.IClientService;
import tn.esprit.spring.service.IFactureService;
import tn.esprit.spring.service.IProduitService;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProduitServiceTest {
    @Autowired
    private IProduitService produitService;

    @Test
    public void testAddProduit() throws ParseException {
        List<Produit> produits = produitService.retrieveAllProduits();
        int expected = produits.size();
       //Produit produit = new Produit("p123", "produit 123", 5.2F);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = dateFormat.parse("16/08/1999");
		Date d2 = dateFormat.parse("1/04/1999");
		Produit produit = new Produit();
		produit.setId(123);
		produit.setTitle("corbeille");
		produit.setDescription("descProduct");
		produit.setCreatedAt(d1);
		produit.setUpdatedAt(d2);
		produit.setPicture("pic.png");
		produit.setPrice(15.2F);
	
       // Produit savedProduit = produitService.addProduit(produit);
       assertEquals(expected + 1, produitService.retrieveAllProduits().size());
       //assertNotNull(savedProduit.getCode());
       //produitService.delete(savedProduit.getIdproduit());
   
    	}

    @Test
    public void testListProduit() {
        produitService.retrieveAllProduits()
                .forEach( produit -> log.info("Produit :"+ produit));
    }
}