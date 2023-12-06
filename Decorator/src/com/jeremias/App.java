package com.jeremias;

import com.jeremias.decorador.BlinajeDecorador;
import com.jeremias.inter.ICuentaBancaria;
import com.jeremias.inter.impl.CuentaAhorro;
import com.jeremias.model.Cuenta;

public class App {
	public static void main(String[] args) {
		/*
		 *	sirve para agregar funcionalidades opcionales (convenientemente) a una estructura sin modificarla
		 */
		
		Cuenta c = new Cuenta(1200, "Jeremias");
		ICuentaBancaria cuenta = new CuentaAhorro();
		// cuentaDecorada.abrir(c);
		ICuentaBancaria cuentaBlindada = new BlinajeDecorador(cuenta);
		cuentaBlindada.abrir(c);
		
	}
}
