package com.kushkumardhawan.rest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.kushkumardhawan.rest.entities.Shops;
import com.kushkumardhawan.rest.repository.ShopsRepository;

@SpringBootTest
public class ShopsAPITest {
	
	@Value("${shops.api.url}")
	private String base_url;

	@Autowired
	private ShopsRepository shops_repository;

	public ShopsRepository getShops_repository() {
		return shops_repository;
	}

	public void setShops_repository(ShopsRepository shops_repository) {
		this.shops_repository = shops_repository;
	}

	@Test
	private void createShop() {
		
		RestTemplate restTemplate = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Shops> shops = (List<Shops>) restTemplate.getForObject(base_url, Shops.class);
		assertNotNull(shops); 

	}

}
