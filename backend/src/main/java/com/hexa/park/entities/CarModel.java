package com.hexa.park.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class CarModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String modelName;
	@JsonManagedReference
	@ManyToOne
	// @JoinColumn(name = "brand_id")
	private CarModBrand carModBrand;
	@JsonBackReference
	@OneToMany(mappedBy = "carModel")
	private List<Car> cars;
}
