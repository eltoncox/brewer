package com.elton.beers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elton.beers.model.Cerveja;
import com.elton.beers.repository.Cervejas;

@Service
public class CadastroCervejaService {

	@Autowired
	private Cervejas cervejas;// salvar as cerveja
	
	@Transactional
	public void salvar(Cerveja cerveja) {
		cervejas.save(cerveja);
	}
	
}