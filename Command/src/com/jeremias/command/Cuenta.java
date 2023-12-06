package com.jeremias.command;

public class Cuenta {
	private int id;
	private double saldo;
	
	public Cuenta(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	
	public void retirar(double monto) {
		this.saldo = this.saldo - monto;
		System.out.println("[COMANDO RESTIRAR] { Cuenta: " + this.id + " Saldo: " + this.saldo + "}");
	}
	
	public void depositar(double monto) {
		this.saldo = this.saldo + monto;
		System.out.println("[COMANDO DEPOSITAR] { Cuenta: " + this.id + " Saldo: " + this.saldo + "}");
	}
	
	@Override
	public String toString() {
		return "Cuenta { id: " + id + " - saldo: " + saldo + " }";
	}
}
