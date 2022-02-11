package com.example.carrito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrito.domain.Producto;
import com.example.carrito.service.ProductoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/productos/")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@PostMapping("/crear")
	public Producto crearProducto(@RequestBody Producto producto) {
		return productoService.crear(producto);
	}
	
	@GetMapping("/listar")
	public List<Producto> listarProductos() {
		return productoService.listar();
	}
	
	@GetMapping("/encontrar/{idProducto}")
	public Producto obtenerProducto(Producto producto) {
		return productoService.buscarProducto(producto);
	}
	
	@PostMapping("/eliminar/{idProducto}")
	public String eliminarProducto(Producto producto) {
		
		productoService.eliminar(producto);
		return "El producto: "+ producto.getNombre() +"ha sido eliminado con exito";
	}
}
