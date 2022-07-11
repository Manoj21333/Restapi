package com.Cricketer.RestapiApp.Service;

import java.util.List;

import com.Cricketer.RestapiApp.Model.Cricketer;

public interface CricketerService {

	Cricketer saveCricketer(Cricketer cricketer);
	List<Cricketer>getall();
	public Cricketer getbyid(int id);
}
