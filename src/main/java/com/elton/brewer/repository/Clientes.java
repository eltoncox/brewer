package com.elton.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elton.brewer.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
