package com.example.carrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrito.domain.Usuario;
import com.example.carrito.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/registrarUsuario")
	public Usuario registerUser(@RequestBody Usuario usuario) throws Exception {

		System.out.println(usuario);
		System.out.println(usuario.getRol());

		Usuario usuarioObj = null;
		usuarioObj = usuarioService.crear(usuario);
		return usuarioObj;
	}
}
