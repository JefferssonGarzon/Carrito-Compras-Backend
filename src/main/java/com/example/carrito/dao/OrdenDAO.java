package com.example.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carrito.domain.Orden;

public interface OrdenDAO extends JpaRepository<Orden, Long>{

}
