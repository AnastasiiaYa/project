package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Client;

@RestController
@RequestMapping("/api/client")
public class ClientsController {
	@Autowired
	private final ClientService service;
	
	public ClientsController(ClientService service){
		super();
		this.service= service;
	}
	
	@GetMapping("/{id}")
	public Client get(@PathVariable String id){
		return service.get(id);
	}
	
	@PostMapping
	public Client create(@RequestBody Client client) {
		return service.create(client);
	}
	
	@PutMapping
	public Client update(@RequestBody Client client) {
		return service.update(client);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id){
		service.delete(id);
	}
}