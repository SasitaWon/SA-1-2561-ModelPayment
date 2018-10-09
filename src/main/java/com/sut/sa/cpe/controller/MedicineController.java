package com.sut.sa.cpe.controller;

import com.sut.sa.cpe.entity.Medicine;
import com.sut.sa.cpe.repository.MedicineRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class MedicineController {
    private MedicineRepository repository;

    public MedicineController(MedicineRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Medicines")
    public Collection<Medicine> Medicine() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
