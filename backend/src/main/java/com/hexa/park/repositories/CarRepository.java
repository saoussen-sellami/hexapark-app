package com.hexa.park.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.park.entities.Car;

public interface CarRepository extends JpaRepository<Car, String> {

}
