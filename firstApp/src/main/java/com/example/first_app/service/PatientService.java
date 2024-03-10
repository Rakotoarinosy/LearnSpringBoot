// Service
package com.example.first_app.service;

import com.example.first_app.entity.Patient;
import com.example.first_app.repository.PatientRepository;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
    
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Iterable<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}

