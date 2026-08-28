package com.hercules.posto_gasolina.controller;

import com.hercules.posto_gasolina.infrastructure.repositories.ClienteRepository;
import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hercules.posto_gasolina.infrastructure.entities.ClienteEntity;
import com.hercules.posto_gasolina.services.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService;


    @PostMapping
    public ResponseEntity<ClienteEntity> cadastrarCliente(@RequestBody ClienteEntity cliente) {
       return ResponseEntity.ok().body(clienteService.cadastrarCliente(cliente));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarCliente(@RequestParam long id) {
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
