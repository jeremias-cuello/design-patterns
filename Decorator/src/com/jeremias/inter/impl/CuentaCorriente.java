package com.jeremias.inter.impl;

import com.jeremias.inter.ICuentaBancaria;
import com.jeremias.model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria{

	@Override
	public void abrir(Cuenta c) {
		System.out.println("Abriendo cuenta corriente de " + c.getCliente());		
	}
}
