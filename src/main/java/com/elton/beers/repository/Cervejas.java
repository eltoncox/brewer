package com.elton.beers.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elton.beers.model.Cerveja;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long> {
	
	public Optional<Cerveja> findBySku(String sku);

}