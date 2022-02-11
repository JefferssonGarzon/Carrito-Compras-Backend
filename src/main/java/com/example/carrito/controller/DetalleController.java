package com.example.carrito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrito.domain.Detalle;
import com.example.carrito.service.DetalleService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/detalles-carrito/")
public class DetalleController {
	
	@Autowired
	private DetalleService detalleService;
	
	@GetMapping("/listar")
	public List<Detalle> listarDetalles(){
		return detalleService.listar();
	}
	
	@GetMapping("/encontrar/{idDetalle}")
	public Detalle obtenerDetalle(Detalle detalle) {
		return detalleService.buscarDetalle(detalle);
	}
}
