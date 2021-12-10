package com.avalon.firstpru.entity;

public class empresa {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "empresa [nombre=" + nombre + "]";
	}
}
