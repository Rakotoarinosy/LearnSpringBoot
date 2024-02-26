// Service
package com.example.first_app.service;

import com.example.first_app.entity.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private List<Patient> patients = new ArrayList<>();
    private int nextId = 1;

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient getPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found");
    }

    public void addPatient(Patient patient) {
        patient.setId(nextId++);
        patients.add(patient);
    }

    public void updatePatient(int id, Patient updatedPatient) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                patient.setNom(updatedPatient.getNom());
                patient.setAge(updatedPatient.getAge());
                patient.setDateDeNaissance(updatedPatient.getDateDeNaissance());
                patient.setEmail(updatedPatient.getEmail());
                patient.setGenre(updatedPatient.getGenre());
                return;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found");
    }

    public void deletePatient(int id) {
        boolean removed = patients.removeIf(patient -> patient.getId() == id);
        if (!removed) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found");
        }
    }
}
