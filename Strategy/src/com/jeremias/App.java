package com.jeremias;

import com.jeremias.strategy.*;

public class App {

	public static void main(String[] args) {
		Contexto ctx = new Contexto(new AntivirusSimple());
		ctx.ejecutar();
	}

}
