package com.kushkumardhawan.rest;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kushkumardhawan.rest.entities.Shops;
import com.kushkumardhawan.rest.services.ShopsService;

@RestController
public class ShopsContoller {
	
	public static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ShopsContoller.class); 

	@Autowired
	private ShopsService service;

	public ShopsService getService() {
		return service;
	}

	public void setService(ShopsService service) {
		this.service = service;
	}

	@RequestMapping(value="/shops", method = RequestMethod.GET )
	public List<Shops> getShops() {
		return service.getShops();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST )
	public Shops addShop(@RequestBody Shops shop) {
		LOGGER.info("Shop:- "+shop.toString());
		return service.addShop(shop);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT )
	public Shops updateShop(@RequestBody Shops shop) {
		return service.updateShop(shop);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE )
	public boolean updateShop(@PathVariable("id") int id) {
		LOGGER.info("ID:- "+id);
		return service.deleteShop(id);
	}
	
	
	

}
