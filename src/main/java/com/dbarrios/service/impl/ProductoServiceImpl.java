package com.dbarrios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbarrios.model.Producto;
import com.dbarrios.repo.IGenericRepo;
import com.dbarrios.repo.IProductoRepo;
import com.dbarrios.service.IProductoService;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService {

	@Autowired
	private IProductoRepo repo;

	@Override
	protected IGenericRepo<Producto, Integer> getRepo() {
		return repo;
	}
}
