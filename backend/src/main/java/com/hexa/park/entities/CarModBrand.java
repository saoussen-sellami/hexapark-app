package com.hexa.park.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
@Entity
@Data
public class CarModBrand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String brandName;
	@JsonBackReference 
	@OneToMany(mappedBy = "carModBrand")
	private List<CarModel> carModels;
}
