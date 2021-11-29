package com.example.transportadora.service;


import com.example.transportadora.model.Pacote;
import com.example.transportadora.model.Status;
import com.example.transportadora.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacoteService {
    private PacoteRepository pacoteRepository;

    @Autowired
    public PacoteService(PacoteRepository pacoteRepository){
        this.pacoteRepository=pacoteRepository;
    }

    public Pacote adicionar (Pacote pacote){
        return pacoteRepository.save(pacote);
    }
    public List<Pacote> listarPacotePorCaminho(){
        return pacoteRepository.findAllByStatus(Status.A_CAMINHO);
    }
    public List<Pacote>listar(){
        return pacoteRepository.findAll();

    }
}