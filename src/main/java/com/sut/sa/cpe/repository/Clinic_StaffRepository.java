package com.sut.sa.cpe.repository;

import com.sut.sa.cpe.entity.Clinic_Staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface Clinic_StaffRepository extends JpaRepository<Clinic_Staff, Long> {
}