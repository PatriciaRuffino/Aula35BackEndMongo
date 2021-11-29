package com.example.transportadora.controller;

import com.example.transportadora.model.Pacote;
import com.example.transportadora.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacote")
public class PacoteController {
    private PacoteService pacoteService;
    @Autowired
    public PacoteController(PacoteService pacoteService) {
        this.pacoteService = pacoteService;
    }
    @PostMapping
    public Pacote registrar (@RequestBody Pacote pacote){
        return pacoteService.adicionar(pacote);
    }
    @GetMapping
    public List<Pacote> buscarTodos(){
        return pacoteService.listar();
    }
    @GetMapping("/a-caminho")
    public List<Pacote> buscarAcaminho(){
        return pacoteService.listarPacotePorCaminho();
    }
}
