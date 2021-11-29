package com.example.transportadora.repository;

import com.example.transportadora.model.Pacote;
import com.example.transportadora.model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacoteRepository extends MongoRepository<Pacote, Integer> {
    List<Pacote> findAllByStatus(Status status);
}

