package com.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turnos.dto.AppointmentDTO;
import com.turnos.model.Appointment;
import com.turnos.model.Professional;
import com.turnos.model.Service;
import com.turnos.repository.AppointmentRepository;
import com.turnos.repository.ProfessionalRepository;
import com.turnos.repository.ServiceRepository;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	private final AppointmentRepository appointmentRepo;
    private final ProfessionalRepository professionalRepository;
    private final ServiceRepository serviceRepository;

    @Autowired
    public AppointmentController(AppointmentRepository appointmentRepo,
                                 ProfessionalRepository professionalRepository,
                                 ServiceRepository serviceRepository) {
        this.appointmentRepo = appointmentRepo;
        this.professionalRepository = professionalRepository;
        this.serviceRepository = serviceRepository;
    }

    @PostMapping
    public Appointment crearAppointment(@RequestBody AppointmentDTO dto) {
        Professional professional = professionalRepository.findById(dto.getProfessional()).orElseThrow();
        Service service = serviceRepository.findById(dto.getService()).orElseThrow();
        Appointment appointment = dto.toEntity(professional, service);
        return appointmentRepo.save(appointment);
    }

    @GetMapping
    public List<Appointment> listarAppointments() {
        return appointmentRepo.findAll();
    }
}