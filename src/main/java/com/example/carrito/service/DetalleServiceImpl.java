package com.example.carrito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.carrito.dao.DetalleDAO;
import com.example.carrito.domain.Detalle;

@Service
public class DetalleServiceImpl implements DetalleService{

	@Autowired
	private DetalleDAO detalleDAO;
	
	@Override
	@Transactional
	public List<Detalle> listar(){
		return detalleDAO.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Detalle buscarDetalle(Detalle detalle) {
		return detalleDAO.findById(detalle.getIdDetalle()).orElse(null);
	}
}

