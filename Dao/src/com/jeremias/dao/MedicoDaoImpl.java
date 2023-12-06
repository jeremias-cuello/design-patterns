package com.jeremias.dao;

import java.util.ArrayList;
import java.util.List;

import com.jeremias.model.Medico;

public class MedicoDaoImpl implements MedicoDao{

private List<Medico> lista = new ArrayList<>();
	
	@Override
	public List<Medico> listarTodos() {
		System.out.println("Listando " + lista.size() + " Medicos:");
		lista.forEach(p -> System.out.println(p));
		return lista;
	}

	@Override
	public Medico leerPorId(int id) {
		
		Medico Medico  = this.lista.get(id - 1);
		
		return Medico;
	}

	@Override
	public void registrar(Medico Medico) {

		lista.add(Medico);
		System.out.println("REGISTRO: " + Medico);
		
	}

	@Override
	public void actualizar(Medico Medico) {
		int index = Medico.getId() - 1;
		Medico aCambiar = lista.get(index);
		lista.set(index, Medico);
		System.out.println("ACTUALIZACION: " + aCambiar + " a " + lista.get(index));		
	}

	@Override
	public void eliminar(int id) {
		Medico aEliminar = lista.get(id - 1);
		lista.remove(id);
		System.out.println("ELIMINACION: " + aEliminar);
	}

	@Override
	public void curar() {
		// alguna logica		
	}

}
