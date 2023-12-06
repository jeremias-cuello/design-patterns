package com.jeremias;

import com.jeremias.model.Cuenta;
import com.jeremias.inter.ICuenta;
import com.jeremias.proxy.CuentaProxy;
import com.jeremias.inter.impl.CuentaBancoAImpl;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "mitocode", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
		// cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		// cuentaProxy.mostrarSaldo(c);
	}

}
