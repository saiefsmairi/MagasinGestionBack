package tn.esprit.control;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entity.Client;
import tn.esprit.entity.Produit;
import tn.esprit.spring.service.IClientService;
import tn.esprit.spring.service.IProduitService;

	@RestController
	@RequestMapping("/produit")
	public class ProduitRestController {
	
	@Autowired
	IProduitService produitService;
	
	@GetMapping("/retrieve-all-produits")
	@ResponseBody
	public List<Produit> getClients() {
	List<Produit> listProduits = produitService.retrieveAllProduits();
	return listProduits;
	}
	
	
	@GetMapping("/retrieve-produit/{produit-id}")
	@ResponseBody
	public Produit retrieveProduit(@PathVariable("produit-id") Long produitID) {
	return produitService.retrieveProduit(produitID);
	}
	
	@PostMapping("/add-produit")
	@ResponseBody
	public Produit addProduit(@RequestBody Produit c)
	{
		
		Produit p = produitService.addProduit(c, c.getRayon().getIdRayon(), c.getStock().getIdstock());
	return p;
	}
	
	@DeleteMapping("/remove-produit/{produit-id}")
	@ResponseBody
	public void removeProduit(@PathVariable("produit-id") Long produitID) {
		produitService.delete(produitID);
	}
	
	
	@PutMapping("/assignProduitToStock/{produit-id}/{stock-id}")
	@ResponseBody
	public void assignProduitToStock(@PathVariable("produit-id") Long produitID,@PathVariable("stock-id") Long stockID) {
		produitService.assignProduitToStock(produitID, stockID);
	}

	@GetMapping("/getRevenuBrutProduit/{produit-id}/{datedeb}/{datefin}")
	@ResponseBody
	public float getRevenuBrutProduit(@PathVariable("produit-id") Long produitID,@PathVariable("datedeb") Date datedeb,@PathVariable("datefin") Date datefin) {
	return produitService.getRevenuBrutProduit(produitID, datedeb, datefin);
	}
	
}
