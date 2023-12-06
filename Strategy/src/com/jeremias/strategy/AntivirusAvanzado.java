package com.jeremias.strategy;

public class AntivirusAvanzado extends AnalisisAvanzado{
	@Override
	public void iniciar() {
		System.out.println("Antivirus Avanzado: Iniciado.");		
	}

	@Override
	public void analizarMemoria() {
		try {
			System.out.println("Analizando Memoria...");
			Thread.sleep(1000);
			System.out.println("Memoria analizada.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void analizarKeyloggers() {
		try {
			System.out.println("Analizadno KeyLoggers...");
			Thread.sleep(1000);
			System.out.println("KeyLoggers analizados.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void analizarRootsKits() {
		try {
			System.out.println("Descomprimiendo zip...");
			Thread.sleep(1000);
			System.out.println("archivos .zip analizados");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void descomprimirZip() {
		try {
			System.out.println("Descomprimiendo zip...");
			Thread.sleep(1000);
			System.out.println("archivos .zip analizados");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void detener() {
		System.out.println("analisis detenido.");
	}
}

