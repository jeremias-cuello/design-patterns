package com.jeremias.observer;

public class PesoARGObservador extends Observador{
	
	private int valor = 1000;
	
	public PesoARGObservador(Subject s) {
		this.subject = s;
		this.subject.agregar(this);
	}
	
	@Override
	public void actualizar(int estado) {
		System.out.println("ARG: " + (valor * estado));
	}
}
