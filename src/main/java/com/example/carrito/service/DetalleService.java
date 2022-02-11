package com.example.carrito.service;

import java.util.List;

import com.example.carrito.domain.Detalle;

public interface DetalleService {

	public List<Detalle> listar();
	
	public Detalle buscarDetalle(Detalle detalle);
}
