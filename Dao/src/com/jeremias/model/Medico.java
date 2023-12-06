package com.jeremias.model;

public class Medico {
	private int id;
	private String nombre;
	int matricula;
	
	public Medico(int id, String nombre, int matricula) {
		this.id = id;
		this.nombre = nombre;
		this.matricula= matricula;
	}
	
	@Override
	public String toString() {
		return "Medico{ id: " + this.id + " - Nombre: " + this.nombre + " - Matricula: " + this.matricula + "}";
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
