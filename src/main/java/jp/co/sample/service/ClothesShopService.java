package jp.co.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.ClothesShop;
import jp.co.sample.repository.ClothesShopRepository;

/**
 * 洋服店のrepositoryを操作する.
 * 
 * @author momo.senda
 *
 */
@Service
@Transactional
public class ClothesShopService {
	@Autowired
	private ClothesShopRepository repository;
	
	public List<ClothesShop> findByGenderAndColor(int gender, String color){
		return repository.findByGenderAndColor(gender, color);
	}
}
