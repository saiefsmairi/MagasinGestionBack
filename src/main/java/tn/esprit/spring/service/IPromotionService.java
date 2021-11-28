package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.entity.Promotion;

public interface IPromotionService {
	
	  Promotion add(Promotion promotion);
	  Promotion update(Promotion promotion);
	    void delete(long id);
	    List<Promotion> findAll();
	    Promotion findById(Long id);

}
