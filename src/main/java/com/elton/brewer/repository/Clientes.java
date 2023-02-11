package com.elton.brewer.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elton.brewer.model.Cliente;
import com.elton.brewer.repository.helper.cliente.ClientesQueries;

public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries {

	public Optional<Cliente> findByCpfOuCnpj(String cpfOuCnpj);

}
