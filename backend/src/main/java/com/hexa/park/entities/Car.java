package com.hexa.park.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Car {

	@Id
	private String plaqueImmatriculation;
	@Temporal(TemporalType.DATE)
	private Date dateSortie;
	@Temporal(TemporalType.DATE)
	private Date dateAchat;
	private String kmInitiale;
	private String typeCarburant;
	private String numChassis;
	private String type;
	private String gallerie;
	private boolean voitureSousLeasing;
	@Temporal(TemporalType.DATE)
	private Date dateDebutLeasing;
	@Temporal(TemporalType.DATE)
	private Date dateFinLeasing;
	private boolean actif;

	@ManyToOne
	@JsonManagedReference
	private CarModel carModel;

}
