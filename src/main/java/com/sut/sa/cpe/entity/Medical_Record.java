package com.sut.sa.cpe.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import java.util.*;
//import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;


@Entity

@ToString
@EqualsAndHashCode  
@Data  
@Table(name="Medical_Record")

public class Medical_Record {
 
@GeneratedValue
@Id

private @NotNull String nameMedicine;
    private @NotNull String typeMedicine;
    private @NotNull Integer amountMedicine;

    public Medical_Record(String nameMedicine, String typeMedicine, Integer amountMedicine) {
     this.nameMedicine = nameMedicine;
     this.typeMedicine = typeMedicine;
     this.amountMedicine = amountMedicine;  
  	}

}