package com.turnos.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.turnos.model.Appointment;
import com.turnos.model.Professional;
import com.turnos.model.Service;


public class AppointmentDTO {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate date;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime hour;
    private Long professional;
    private Long service;

    // Constructor vacío
    public AppointmentDTO() {}

    // Constructor con argumentos
    public AppointmentDTO(Long id, String name, String email, String phoneNumber, LocalDate date, LocalTime hour, Long professional, Long service) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.hour = hour;
        this.professional = professional;
        this.service = service;
    }

    // Convierte de entidad a DTO
    public static AppointmentDTO fromEntity(Appointment appointment) {
        AppointmentDTO dto = new AppointmentDTO();
        dto.setId(appointment.getId());
        dto.setName(appointment.getName());
        dto.setEmail(appointment.getEmail());
        dto.setPhoneNumber(appointment.getPhoneNumber());
        dto.setDate(appointment.getDate());
        dto.setHour(appointment.getHour());
        dto.setProfessional(
            appointment.getProfessional() != null ? appointment.getProfessional().getId() : null
        );
        dto.setService(
            appointment.getService() != null ? appointment.getService().getId() : null
        );
        return dto;
    }

    // Convierte de DTO a entidad (requiere instancias de Professional y Service)
    public Appointment toEntity(Professional professional, Service service) {
        return new Appointment(
            this.name,
            this.date,
            this.email,
            this.phoneNumber,
            this.hour,
            professional,
            service
        );
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getHour() { return hour; }
    public void setHour(LocalTime hour) { this.hour = hour; }

    public Long getProfessional() { return professional; }
    public void setProfessional(Long professional) { this.professional = professional; }

    public Long getService() { return service; }
    public void setService(Long service) { this.service = service; }
}