package com.Cricketer.RestapiApp.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cricketer.RestapiApp.Model.Cricketer;
import com.Cricketer.RestapiApp.Service.CricketerService;

@RestController
@RequestMapping("/api/cricketer")
public class CricketerController {

	private CricketerService cricketerService;
	public CricketerController(CricketerService cricketerService) {
		super();
		this.cricketerService = cricketerService;
	}
// build rest api
	@PostMapping()
	public ResponseEntity<Cricketer>saveCricketer(@RequestBody Cricketer cricketer){
		return new  ResponseEntity<Cricketer>(cricketerService.saveCricketer(cricketer),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Cricketer>getall(){
		return cricketerService.getall();
	}
	@GetMapping("{id}")
	public ResponseEntity<Cricketer>getbyid(@PathVariable("id") int id){
		return new ResponseEntity<Cricketer>(cricketerService.getbyid(id),HttpStatus.OK);
		
	}
}
