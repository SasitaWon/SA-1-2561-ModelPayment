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
@Table(name="Patient") 

public class Patient {
@Id  
@GeneratedValue
	private @NotNull String idPatient;
	private @NotNull String namePatient;

    @OneToMany(
        mappedBy="patient", 
        cascade = CascadeType.ALL,
        orphanRemoval = true) 
		private List<Payment> Payment = new ArrayList<>();

    public Patient(String idPatient, String namePatient) {
     this.idPatient = idPatient;
     this.namePatient = namePatient;
  	}
}