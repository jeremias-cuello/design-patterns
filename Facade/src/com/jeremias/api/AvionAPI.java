package com.jeremias.api;

public class AvionAPI {
	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("==========================");
		System.out.println("Vuelos encontrados hacia " + destino + "desde " + origen);
		System.out.println("Fecha ida: " + fechaIda+ "Fecha Vuelta" + fechaVuelta);
		System.out.println("==========================");
	}
}
