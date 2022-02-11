 package com.example.carrito.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "orden")
public class Orden implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrden;
	
	@NotEmpty
	private Date fechaOrden;
	
	@OneToMany
	@JoinColumn(name = "id_orden_FK")
	private List<Detalle> detalles;
	
//	@ManyToOne
//	@JoinColumn(name = "id_usuario_FK")
//	private Usuario usuario;
	
}
