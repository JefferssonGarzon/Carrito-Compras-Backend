package com.example.carrito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.carrito.dao.OrdenDAO;
import com.example.carrito.domain.Orden;

@Service
public class OrdenServiceImpl implements OrdenService{
	
	@Autowired
	private OrdenDAO ordenDAO;
	
	@Override
	@Transactional
	public List<Orden> listar() {
		return ordenDAO.findAll();
	}
	
	public Orden buscarOrden(Orden orden) {
		return ordenDAO.findById(orden.getIdOrden()).orElse(null);
	}
}
