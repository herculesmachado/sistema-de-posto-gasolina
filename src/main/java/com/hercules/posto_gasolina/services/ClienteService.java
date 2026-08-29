package com.hercules.posto_gasolina.services;
import java.util.List;

import javax.management.RuntimeErrorException;

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


        if (cliente.getCpf().length() > 12 || cliente.getCpf().length() < 11) {
            throw new RuntimeException("Quantidade números inválidos, somente permitido 11");
        } 

        return clienteRepository.save(cliente);
    }

    public List<ClienteEntity> listarClientes() {
        return clienteRepository.findAll();
    }

    public void deletarCliente(long id) {
        clienteRepository.deleteById(id);
    }
}
