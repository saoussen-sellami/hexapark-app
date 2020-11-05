package com.hexa.park.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.park.entities.Client;
import com.hexa.park.model.MessageResponse;
import com.hexa.park.repositories.ClientRepository;

@Service
public class ClientService {
 @Autowired
 private ClientRepository clientRepository;
 
 public MessageResponse save(Client client) {

		boolean exist = clientRepository.existsByEmail(client.getEmail());
		if (exist) {
			return new MessageResponse(false, "Warning", "Client already exists");
		}
		clientRepository.save(client);

		return new MessageResponse(true, "Success", "Operation performed");
	}
	public MessageResponse update(Client client) {

		boolean exist = clientRepository.existsByEmail(client.getEmail());
		if (exist) {
			return new MessageResponse(false, "Warning", "Client already exists");
		}
		clientRepository.save(client);

		return new MessageResponse(true, "Success", "Operation performed");
	}
	

	public MessageResponse delete(String id) {

		clientRepository.deleteById(id);

		return new MessageResponse(true, "Success", "Operation performed");
	}

	public Client findById(String id) {
		return clientRepository.findById(id).orElse(null);
	}

	public List<Client> findAll() {
		return clientRepository.findAll();
	}
}
