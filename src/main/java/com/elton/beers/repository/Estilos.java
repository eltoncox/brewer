package com.elton.beers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elton.beers.model.Estilo;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long> {

}