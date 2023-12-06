package com.jeremias.model;

public class Persona {
	private int id;
	private String nombre;
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona{ id: " + this.id + " - Nombre: " + this.nombre + "}";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
