package com.example.carrito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.carrito.dao.ProductoDAO;
import com.example.carrito.domain.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	@Transactional
	public Producto crear(Producto producto) {
		return productoDAO.save(producto);
	}
	
	@Override
	public List<Producto> listar(){
		return productoDAO.findAll();
	}
	
	@Override
	public void eliminar(Producto producto) {
		productoDAO.delete(producto);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Producto buscarProducto(Producto producto) {
		return productoDAO.findById(producto.getIdProducto()).orElse(null);
	}
		
}
