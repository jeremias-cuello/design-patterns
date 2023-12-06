package com.jeremias.decorador;

import com.jeremias.inter.ICuentaBancaria;
import com.jeremias.model.Cuenta;

public class BlinajeDecorador extends CuentaDecorador{
	public BlinajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}
	
	@Override
	public void abrir(Cuenta c) {
		cuentaDecorada.abrir(c);
		agregarBlindaje(c);
	}
	
	public void agregarBlindaje(Cuenta c) {
		System.out.println("Se agregó un blindaje a la cuenta: " + c.getCliente());
	}
}
