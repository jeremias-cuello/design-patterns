package com.jeremias.dao;

import com.jeremias.model.Medico;

public interface MedicoDao extends CRUD<Medico>{
	void curar();
}
