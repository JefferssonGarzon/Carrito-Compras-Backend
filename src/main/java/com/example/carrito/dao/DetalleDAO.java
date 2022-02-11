package com.example.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carrito.domain.Detalle;

public interface DetalleDAO extends JpaRepository<Detalle, Long>{

}
