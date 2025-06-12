package com.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turnos.model.Service;
import com.turnos.repository.ServiceRepository;

@RestController
@RequestMapping("/services")
public class ServiceController {
	@Autowired
	private ServiceRepository serviceRepo;
	
	@PostMapping
	public Service crearService(@RequestBody Service s) {
		return serviceRepo.save(s);
	}

	@GetMapping
	public List<Service> listarServices() {
		return serviceRepo.findAll();
	}
}
