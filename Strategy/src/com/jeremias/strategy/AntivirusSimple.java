package com.jeremias.strategy;

public class AntivirusSimple extends AnalisisSimple{

	@Override
	public void iniciar() {
		System.out.println("Antivirus Simple: Iniciado.");		
	}

	@Override
	public void saltarZip() {
		try {
			System.out.println("Analizando...");
			Thread.sleep(2500);
			System.out.println("Saltamos archivos .zip");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void detener() {
		System.out.println("analisis detenido.");
	}

}
