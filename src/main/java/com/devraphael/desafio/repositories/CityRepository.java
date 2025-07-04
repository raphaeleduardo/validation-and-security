package com.devraphael.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devraphael.desafio.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	
}
