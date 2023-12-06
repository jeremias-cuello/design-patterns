package com.jeremias.dao;
import com.jeremias.model.*;

import java.util.List;

public interface PersonaDao {

	List<Persona> listarTodos();
	Persona leerPorId(int id);
	void registrar(Persona persona);
	void actualizar(Persona persona);
	void eliminar(int id);
}
