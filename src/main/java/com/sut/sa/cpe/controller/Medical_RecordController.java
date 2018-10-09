package com.sut.sa.cpe.controller;

import com.sut.sa.cpe.entity.Medical_Record;
import com.sut.sa.cpe.repository.Medical_RecordRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class Medical_RecordController {
    private Medical_RecordRepository repository;

    public Medical_RecordController(Medical_RecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Medical_Records")
    public Collection<Medical_Record> Medical_Record() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}


