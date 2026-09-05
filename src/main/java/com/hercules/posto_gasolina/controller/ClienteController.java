package com.hercules.posto_gasolina.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping
    public ResponseEntity<List<ClienteEntity>> listarClientes() {
        return ResponseEntity.ok().body(clienteService.listarClientes());
    }

    @GetMapping("/nome")
    public ResponseEntity<List<ClienteEntity>> buscarCliente(@RequestParam String nomeCliente) {
        return ResponseEntity.ok().body(clienteService.buscarClientePorNome(nomeCliente));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarCliente(@RequestParam long id) {
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteEntity> editarCliente(@PathVariable long id, @RequestBody ClienteEntity clienteAtualizado) {
        return ResponseEntity.ok().body(clienteService.editarCliente(id, clienteAtualizado));
    }

    
}
