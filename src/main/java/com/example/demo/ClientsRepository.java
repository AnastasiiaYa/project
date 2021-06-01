package com.example.demo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Client;
@Repository
public interface ClientsRepository extends MongoRepository<Client, String>{
	Optional<Client> findById(String id);
	void deleteById(String id);
}

