package com.jeremias.dao;

import java.util.List;

public interface CRUD<T> {
	List<T> listarTodos();
	T leerPorId(int id);
	void registrar(T tipo);
	void actualizar(T tipo);
	void eliminar(int id);
}
