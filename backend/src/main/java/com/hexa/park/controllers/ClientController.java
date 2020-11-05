package com.hexa.park.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.park.entities.Client;
import com.hexa.park.model.MessageResponse;
import com.hexa.park.services.ClientService;

@RestController
public class ClientController {
  @Autowired
  private ClientService clientService;
  
  @PostMapping
	public MessageResponse save(@RequestBody Client client) {
		return clientService.save(client);
	}

	@PutMapping
	public MessageResponse update(@RequestBody Client client) {
		return clientService.update(client);
	}

	@DeleteMapping("/{id}")
	public MessageResponse delete(@PathVariable String id) {
		return clientService.delete(id);
	}
	

	@GetMapping
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@GetMapping("/{id}")
	public Client findById(@PathVariable String id) {
		return clientService.findById(id);
	}
}
