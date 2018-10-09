package com.sut.sa.cpe.repository;

import com.sut.sa.cpe.entity.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface PaymentRepository extends JpaRepository<Payment, Long> {
}