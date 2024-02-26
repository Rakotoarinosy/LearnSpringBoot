// Contrôleur
package com.example.first_app.controller;

import com.example.first_app.entity.Patient;
import com.example.first_app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }

    @PostMapping
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable int id, @RequestBody Patient patient) {
        patientService.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }
}
