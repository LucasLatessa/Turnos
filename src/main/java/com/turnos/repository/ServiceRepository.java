package com.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turnos.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {}