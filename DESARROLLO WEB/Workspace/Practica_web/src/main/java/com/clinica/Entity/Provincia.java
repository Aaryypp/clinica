package com.clinica.Entity;

import jakarta.persistence.Entity;

@Entity
public class Provincia {
	private Long id_provincia;
	private String nombre_provincia;
	public Long getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(Long id_provincia) {
		this.id_provincia = id_provincia;
	}
	public String getNombre_provincia() {
		return nombre_provincia;
	}
	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}

}
