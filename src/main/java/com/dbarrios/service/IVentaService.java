package com.dbarrios.service;

import com.dbarrios.model.Venta;

public interface IVentaService extends ICRUD<Venta, Integer>  {

	Venta registrarTransaccion(Venta venta) throws Exception;
	
}
