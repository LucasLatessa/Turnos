package com.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turnos.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}