package com.example.carrito.service;

import java.util.List;

import com.example.carrito.domain.Orden;

public interface OrdenService {

	public List<Orden> listar();
	
	public Orden buscarOrden(Orden orden);
}
