package com.hexa.park.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorsDetails {

	private Date date;
	private String message; 
	private String detail;
}
