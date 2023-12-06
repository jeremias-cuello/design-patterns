package com.jeremias.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Invoker {
	private List<IOperacion> operaciones = new ArrayList();
	
	public void recibirOperaciones(IOperacion operacion) {
		this.operaciones.add(operacion);
	}
	
	public void realizarOperaciones() {
		this.operaciones.forEach(task -> task.execute());
	}
}
