package com.sut.sa.cpe.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import java.util.*;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@ToString
@EqualsAndHashCode  
@Data  
@Table(name="Clinic_Staff") 

public class Clinic_Staff {
@Id  
@GeneratedValue 

	private @NotNull String idStaff;
	private @NotNull String nameStaff;

	@OneToMany(
        mappedBy="clinic_Staff", 
        cascade = CascadeType.ALL,
        orphanRemoval = true) 
		private List<Payment> Payment = new ArrayList<>();

    public Clinic_Staff(String idStaff, String nameStaff) {
     this.idStaff = idStaff;
     this.nameStaff = nameStaff;
     
  	}

}