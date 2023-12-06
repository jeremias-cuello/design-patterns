package com.jeremias;

import com.jeremias.observer.*;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dolares obtendra: ");
		subject.setEstado(10);
		System.out.println("-----------");
		System.out.println("Si desea cambiar 100 dolares obtendra: ");
		subject.setEstado(100);		
	}

}
