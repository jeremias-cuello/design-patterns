package com.jeremias;

import com.jeremias.dao.*;
import com.jeremias.model.*;

public class App {

	public static void main(String[] args) {
		PersonaDao dao = new PersonaDaoImpl();
		Persona p1 = new Persona(1, "Jeremias");
		Persona p2 = new Persona(2, "Natanael");
		Persona p3 = new Persona(3, "Cuello");
		Persona p2Cambiada = new Persona(2, "OtroNombre");
		
		dao.listarTodos();
		System.out.println("--------------");
		dao.registrar(p1);
		dao.registrar(p2);
		dao.registrar(p3);
		System.out.println("--------------");
		dao.listarTodos();
		System.out.println("--------------");
		dao.actualizar(p2Cambiada);
		System.out.println("--------------");
		dao.listarTodos();
		System.out.println("--------------");
		p1.setNombre("Fulano"); // cambia aca y en la lista
		dao.actualizar(p1); // la lista apunta al puntero de p1, si cambia p1 tambien en la lista
		System.out.println("--------------");
		dao.listarTodos();
	}

}
