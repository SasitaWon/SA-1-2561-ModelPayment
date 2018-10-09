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
@Table(name="Payment") 

public class Payment {
@Id  
@GeneratedValue
    
    
	private @NotNull String idPayment;
	private @NotNull Date date;
    private @NotNull String Time;
    //private @NotNull String namestaff;
    //private @NotNull String namePatient;
    private @NotNull String nameMedicine;
    private @NotNull String typeMedicine;
    private @NotNull Integer amountMedicine;
    private @NotNull Integer priceMedicine;
    


    @ManyToOne(fetch = FetchType.LAZY)   
    @JoinColumn(name = "namestaff")     
    private Clinic_Staff clinic_Staff;

    @ManyToOne(fetch = FetchType.LAZY)   
    @JoinColumn(name = "namePatient")     
    private Patient patient;


    public Payment(String idPayment,Date date,String Time,String nameMedicine,
                   String typeMedicine,Integer amountMedicine,Integer priceMedicine) {
     this.idPayment = idPayment;
     this.date = date;
     this.Time = Time;
     //this.namestaff = namestaff;
     //this.namePatient = namePatient;
     this.nameMedicine = nameMedicine;
     this.typeMedicine = typeMedicine;
     this.amountMedicine = amountMedicine;
     this.priceMedicine = priceMedicine;
    
  	}

}