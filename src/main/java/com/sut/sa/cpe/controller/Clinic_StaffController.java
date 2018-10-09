package com.sut.sa.cpe.controller;

import com.sut.sa.cpe.entity.Clinic_Staff;
import com.sut.sa.cpe.repository.Clinic_StaffRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class Clinic_StaffController {
    private Clinic_StaffRepository repository;

    public Clinic_StaffController(Clinic_StaffRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Clinic_Staffs")
    public Collection<Clinic_Staff> Clinic_Staff() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
    
}
