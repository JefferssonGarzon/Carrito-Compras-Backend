package com.example.carrito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrito.domain.Orden;
import com.example.carrito.service.OrdenService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/carrito/")
public class OrdenController {

	@Autowired
	private OrdenService ordenService;
	
	@GetMapping("/listar")
	public List<Orden> listarOrdenes() {
		return ordenService.listar();
	}
	
	@GetMapping("/encontrar/{idOrden}")
	public Orden obtenerOrden(Orden orden) {
		return ordenService.buscarOrden(orden);
	}
}
