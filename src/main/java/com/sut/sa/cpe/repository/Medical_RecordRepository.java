package com.sut.sa.cpe.repository;

import com.sut.sa.cpe.entity.Medical_Record;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public
interface Medical_RecordRepository extends JpaRepository<Medical_Record, Long> {
}