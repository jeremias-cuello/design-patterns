package com.jeremias.strategy;

public abstract class AnalisisAvanzado implements IEstrategia{
	@Override
	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyloggers();
		analizarRootsKits();
		descomprimirZip();
		detener();
	}
	
	public abstract void iniciar();
	public abstract void analizarMemoria();
	public abstract void analizarKeyloggers();
	public abstract void analizarRootsKits();
	public abstract void descomprimirZip();
	public abstract void detener();

}
