package com.hexa.park.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.park.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

	boolean existsByEmail(String email);

	void deleteById(String id);

	Optional<Client> findById(String id);


}
