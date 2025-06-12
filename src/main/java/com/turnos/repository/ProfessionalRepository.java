package com.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turnos.model.Professional;

public interface ProfessionalRepository extends JpaRepository<Professional, Long> {}
