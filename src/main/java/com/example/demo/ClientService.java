package com.example.demo;

import org.springframework.stereotype.Service;
import com.example.demo.Client;
@Service
public class ClientService {
	private final ClientsRepository repository;
	
	public ClientService (ClientsRepository repository)
	{
		super();
		this.repository=repository;
	}
	
	public Client get(String id){
		return repository.findById(id).orElse(null);
	}
	
	public Client create(Client client){
		return repository.save(client);
	}
	
	public Client update(Client client){
		return repository.save(client);
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
}
