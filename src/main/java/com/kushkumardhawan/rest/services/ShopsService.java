package com.kushkumardhawan.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushkumardhawan.rest.entities.Shops;
import com.kushkumardhawan.rest.repository.ShopsRepository;

@Service
public class ShopsService {

	@Autowired
	ShopsRepository shops_repository;

	public ShopsRepository getShops_repository() {
		return shops_repository;
	}

	public void setShops_repository(ShopsRepository shops_repository) {
		this.shops_repository = shops_repository;
	}

	public List<Shops> getShops() {
		List<Shops> shops = (List<Shops>) shops_repository.findAll();
		return shops;
	}

	public Shops addShop(Shops shop) {
		shops_repository.save(shop);
		return shops_repository.save(shop);
	}

	public Shops updateShop(Shops shop) {
		shops_repository.save(shop);
		return shops_repository.save(shop);
	}

	public boolean deleteShop(Integer id) {

		shops_repository.deleteById(id);
		return true;
	}

}
