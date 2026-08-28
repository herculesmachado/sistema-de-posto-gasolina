package com.hercules.posto_gasolina.services;

import com.hercules.posto_gasolina.controller.AbastecimentoController;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.hercules.posto_gasolina.infrastructure.entities.ClienteEntity;
import com.hercules.posto_gasolina.infrastructure.repositories.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteEntity cadastrarCliente(ClienteEntity cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new RuntimeException("O nome do cliente não pode ser nulo ou vazio.");
        } 
        return clienteRepository.save(cliente);
        
        
    }
}
