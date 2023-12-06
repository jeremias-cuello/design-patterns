package com.jeremias.observer;

import java.util.ArrayList;

public class Subject {
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	private int estado;
	
	public void agregar(Observador o) {
		observadores.add(o);
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estadoNuevo) {
		this.estado = estadoNuevo;
		notificarObservadores();
	}
	
	public void notificarObservadores() {
		this.observadores.forEach(o -> o.actualizar(this.estado));
	}
	
	
}
