package com.jeremias.dao;

import java.util.ArrayList;
import java.util.List;

import com.jeremias.model.Persona;

public class PersonaDaoImpl implements PersonaDao{

	private List<Persona> lista = new ArrayList<>();
	
	@Override
	public List<Persona> listarTodos() {
		System.out.println("Listando " + lista.size() + " Personas:");
		lista.forEach(p -> System.out.println(p));
		return lista;
	}

	@Override
	public Persona leerPorId(int id) {
		
		Persona persona  = this.lista.get(id - 1);
		
		return persona;
	}

	@Override
	public void registrar(Persona persona) {

		lista.add(persona);
		System.out.println("REGISTRO: " + persona);
		
	}

	@Override
	public void actualizar(Persona persona) {
		int index = persona.getId() - 1;
		Persona aCambiar = lista.get(index);
		lista.set(index, persona);
		System.out.println("ACTUALIZACION: " + aCambiar + " a " + lista.get(index));		
	}

	@Override
	public void eliminar(int id) {
		Persona aEliminar = lista.get(id - 1);
		lista.remove(id);
		System.out.println("ELIMINACION: " + aEliminar);
	}
	
}
