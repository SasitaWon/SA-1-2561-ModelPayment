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
@Table(name="Medicine") 

public class Medicine {
@Id  
@GeneratedValue

	private @NotNull String priceMedicine;
    public Medicine(String priceMedicine) {
     this.priceMedicine = priceMedicine;
  	}
}