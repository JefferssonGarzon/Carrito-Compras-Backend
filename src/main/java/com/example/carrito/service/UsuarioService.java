package com.example.carrito.service;

import java.util.List;

import com.example.carrito.domain.Usuario;

public interface UsuarioService {

	public Usuario crear(Usuario usuario);
	
	public List<Usuario> listar();
	
	public void eliminar(Usuario usuario);
	
	public Usuario encontrarUsuario(Usuario usuario);
	
}
