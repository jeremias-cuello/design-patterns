package com.jeremias.observer;

public class PesoMXObservador extends Observador {
	private int valor = 32;
	public PesoMXObservador(Subject s) {
		this.subject = s;
		this.subject.agregar(this);
	}

	@Override
	public void actualizar(int estado) {
		System.out.println("MX: " + (valor * estado));
	}
	
}
