package com.jeremias.observer;

public abstract class Observador {
	protected Subject subject;
	public abstract void actualizar(int estado);
}
