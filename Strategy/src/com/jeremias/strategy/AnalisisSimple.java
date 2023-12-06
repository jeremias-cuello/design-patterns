package com.jeremias.strategy;

public abstract class AnalisisSimple implements IEstrategia{
	@Override
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}
	
	public abstract void iniciar();
	public abstract void saltarZip();
	public abstract void detener();
}
