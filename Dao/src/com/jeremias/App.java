package com.jeremias;

import com.jeremias.dao.*;
import com.jeremias.model.*;

public class App {

	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDaoImpl();
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

		/*
		MedicoDao daoMedico = new MedicoDaoImpl();
		Medico m1 = new Medico(1, "Jeremias", 21354);
		Medico m2 = new Medico(2, "Natanael", 3512);
		Medico m3 = new Medico(3, "Cuello", 25421);
		Medico m2Cambiada = new Medico(2, "OtroNombre", 21354);

		daoMedico.listarTodos();
		System.out.println("--------------");
		daoMedico.registrar(m1);
		daoMedico.registrar(m2);
		daoMedico.registrar(m3);
		System.out.println("--------------");
		daoMedico.listarTodos();
		System.out.println("--------------");
		daoMedico.actualizar(m2Cambiada);
		System.out.println("--------------");
		daoMedico.listarTodos();
		System.out.println("--------------");
		m1.setNombre("Fulano"); // cambia aca y en la lista
		daoMedico.actualizar(m1); // la lista apunta al puntero de p1, si cambia p1 tambien en la lista
		System.out.println("--------------");
		daoMedico.listarTodos();
		*/
	}

}
