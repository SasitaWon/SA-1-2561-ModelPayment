package com.sut.sa.cpe.controller;

import com.sut.sa.cpe.entity.Patient;
import com.sut.sa.cpe.repository.PatientRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class PatientController {
    private PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Patients")
    public Collection<Patient> Patient() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}


