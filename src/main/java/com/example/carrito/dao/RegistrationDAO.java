package com.example.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carrito.domain.Usuario;

public interface RegistrationDAO extends JpaRepository<Usuario, Long>{

//	public Usuario findByEmail(String email);
}
