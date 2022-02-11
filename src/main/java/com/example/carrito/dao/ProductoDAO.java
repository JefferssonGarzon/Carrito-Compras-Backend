package com.example.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carrito.domain.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long>{

}
