package com.jeremias.strategy;

public class Contexto {
	private IEstrategia estrategia;
	
	public Contexto(IEstrategia s) {
		this.estrategia = s;
	}
	
	public void ejecutar() {
		this.estrategia.analizar();
	}
}
