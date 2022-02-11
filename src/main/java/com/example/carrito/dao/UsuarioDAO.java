package com.example.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carrito.domain.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{
	
}
