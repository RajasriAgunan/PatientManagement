package com.exampleMiniProjectMedicineApp.PatientMedicineAppointmentSystem.repository;

import com.exampleMiniProjectMedicineApp.PatientMedicineAppointmentSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByAppointmentTimeBetween(LocalDateTime atStartOfDay, LocalDateTime atTime);

}
