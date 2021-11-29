package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Promotion;
import tn.esprit.spring.repository.PromotionRepository;

@Service
public class PromotionServiceImpl implements IPromotionService {
	
	@Autowired
	private PromotionRepository promotionRepository;

	@Override
	public Promotion add(Promotion promotion)
	{
		return promotionRepository.save(promotion);
	}

	@Override
	public Promotion update(Promotion promotion) {
		return promotionRepository.save(promotion);
	}

	@Override
	public void delete(long id) {
        promotionRepository.deleteById(id);
		
	}

	@Override
	public List<Promotion> findAll() {
        return promotionRepository.findAll();
	}

	@Override
	public Promotion findById(Long id) {
		return promotionRepository.findById(id).orElse(null);

	}
	
	

}
