package com.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turnos.model.Professional;
import com.turnos.repository.ProfessionalRepository;

@RestController
@RequestMapping("/professionals")
public class ProfessionalController {

    @Autowired
    private ProfessionalRepository professionalRepo;

    @PostMapping
    public Professional crearProfessional(@RequestBody Professional p) {
        return professionalRepo.save(p);
    }

    @GetMapping
    public List<Professional> listar() {
        return professionalRepo.findAll();
    }
}