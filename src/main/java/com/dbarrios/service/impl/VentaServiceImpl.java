package com.dbarrios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dbarrios.model.Venta;
import com.dbarrios.repo.IGenericRepo;
import com.dbarrios.repo.IVentaRepo;
import com.dbarrios.service.IVentaService;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta, Integer> implements IVentaService  {

	@Autowired
	private IVentaRepo repo;

	@Override
	protected IGenericRepo<Venta, Integer> getRepo() {
		return repo;
	}

	@Transactional
	@Override
	public Venta registrarTransaccion(Venta venta) throws Exception {
		venta.getDetalleVenta().forEach(d -> d.setVenta(venta));
		return repo.save(venta);
	}
}
