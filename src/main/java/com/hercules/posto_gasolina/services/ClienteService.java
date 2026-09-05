package com.hercules.posto_gasolina.services;
import java.util.List;
import org.springframework.stereotype.Service;

import com.hercules.posto_gasolina.infrastructure.entities.ClienteEntity;
import com.hercules.posto_gasolina.infrastructure.repositories.ClienteRepository;

import jakarta.persistence.EntityNotFoundException;
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

    public ClienteEntity buscarClientePorId(long id) {
        return clienteRepository.findById(id)
                                .orElseThrow(() -> new EntityNotFoundException("Buscar não realizado com sucesso no ID: " + id));
    }

    public void deletarCliente(long id) {
        clienteRepository.deleteById(id);
    }

    public ClienteEntity editarCliente(long id, ClienteEntity clienteAtualizado) {
        ClienteEntity clienteExistente = clienteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));
        
        clienteExistente.setTelefoneCliente(clienteAtualizado.getTelefoneCliente());

        return clienteRepository.save(clienteExistente);
    }
}
