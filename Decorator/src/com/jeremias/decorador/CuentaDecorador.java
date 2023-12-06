package com.jeremias.decorador;

import com.jeremias.inter.ICuentaBancaria;
import com.jeremias.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria{

	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}
	
	@Override
	public void abrir(Cuenta c) {
		this.cuentaDecorada.abrir(c);
	}
	
}
