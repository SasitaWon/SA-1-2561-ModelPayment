package com.sut.sa.cpe.controller;

import com.sut.sa.cpe.entity.Payment;
import com.sut.sa.cpe.repository.PaymentRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class PaymentController {
    private PaymentRepository repository;

    public PaymentController(PaymentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Payments")
    public Collection<Payment> Payment() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}