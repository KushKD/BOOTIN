package com.kushkumardhawan.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kushkumardhawan.rest.entities.Shops;

@Repository
public interface ShopsRepository extends CrudRepository<Shops, Integer> {

}
