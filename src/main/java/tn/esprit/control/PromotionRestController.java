package tn.esprit.control;

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
import tn.esprit.entity.Promotion;
import tn.esprit.spring.service.IPromotionService;

@RestController
@RequestMapping("/promotion")
public class PromotionRestController {
	
	@Autowired
	IPromotionService promotionService;
	

	@GetMapping("/getAll")
	public List<Promotion> getPromotion() {
	return  promotionService.findAll();
	}
	
	
	@GetMapping("/getById/{id}")
	@ResponseBody
	public Promotion retrievePromotion(@PathVariable("id") Long id) {
	return promotionService.findById(id);
	}
	
	
	@PostMapping("/add")
	@ResponseBody
	public Promotion addPromotion(@RequestBody Promotion p)
	{
		Promotion promotion = promotionService.add(p);
		return promotion;
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void removePromotion(@PathVariable("id") Long id) {
		promotionService.delete(id);
	}
	
	@PutMapping("/modify")
	@ResponseBody
	public Promotion modifyPromotion(@RequestBody Promotion promotion) {
	return promotionService.update(promotion);
	}
	
	
	

	
	

}
