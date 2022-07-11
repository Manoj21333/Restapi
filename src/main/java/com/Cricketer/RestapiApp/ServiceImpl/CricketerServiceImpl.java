package com.Cricketer.RestapiApp.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Cricketer.RestapiApp.Exception.ResourseNotFoundException;
import com.Cricketer.RestapiApp.Model.Cricketer;
import com.Cricketer.RestapiApp.Repository.CricketersRepo;
import com.Cricketer.RestapiApp.Service.CricketerService;
@Service
public class CricketerServiceImpl implements CricketerService{
	private CricketersRepo cricketersrepo;
	
	@Override
	public List<Cricketer> getall() {
		// TODO Auto-generated method stub
		return cricketersrepo.findAll();
	}

	public CricketerServiceImpl(CricketersRepo cricketersrepo) {
		super();
		this.cricketersrepo = cricketersrepo;
	}

	@Override
	public Cricketer saveCricketer(Cricketer cricketer) {
		  return cricketersrepo.save(cricketer);
	}

	
	@Override
	public Cricketer getbyid(int id) {
		Optional<Cricketer>cricketer=cricketersrepo.findById(id);
		if(cricketer.isPresent()) {
			return  cricketer.get();
			}
		else {
			throw new ResourseNotFoundException("Cricketer", "id",id);
		}
	}

}
