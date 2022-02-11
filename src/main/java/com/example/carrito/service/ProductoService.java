package com.example.carrito.service;

import java.util.List;

import com.example.carrito.domain.Producto;

public interface ProductoService {

	public Producto crear(Producto producto);
	
	public List<Producto> listar();
	
	public void eliminar(Producto producto);
	
	public Producto buscarProducto(Producto producto);
}
