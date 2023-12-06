package com.jeremias;

import com.jeremias.command.*;

public class App {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 1200);
		Invoker inv = new Invoker();
		
		RetirarImpl rti = new RetirarImpl(cuenta, 100);
		inv.recibirOperaciones(rti);
		
		System.out.println(cuenta);
		
		DepositarImpl dpi = new DepositarImpl(cuenta, 500);
		
		inv.recibirOperaciones(dpi);
		
		System.out.println(cuenta);
		
		inv.realizarOperaciones();
		
		System.out.println(cuenta);
	}
}
