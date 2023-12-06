package com.jeremias.observer;

public class SolObservador  extends Observador {
	private int valor = 20;
	
	public SolObservador(Subject s) {
		this.subject = s;
		this.subject.agregar(this);
	}

	@Override
	public void actualizar(int estado) {
		System.out.println("SOL: " + (valor * estado));
	}
}
