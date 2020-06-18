package com.dbarrios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbarrios.model.Persona;
import com.dbarrios.repo.IGenericRepo;
import com.dbarrios.repo.IPersonaRepo;
import com.dbarrios.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;

	@Override
	protected IGenericRepo<Persona, Integer> getRepo() {
		return repo;
	}
}
