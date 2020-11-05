package com.hexa.park.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.park.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
