package com.jeremias.facade;

import com.jeremias.api.HotelAPI;
import com.jeremias.api.AvionAPI;

public class CheckFacade {
	private HotelAPI hotelAPI;
	private AvionAPI avionAPI;
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
	}
}
