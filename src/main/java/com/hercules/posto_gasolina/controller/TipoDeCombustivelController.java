package com.hercules.posto_gasolina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hercules.posto_gasolina.dto.TipoDeCombustivelDTO;
import com.hercules.posto_gasolina.infrastructure.entities.TipoDeCombustivelEntity;
import com.hercules.posto_gasolina.services.TipoDeCombustivelService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/tipo-de-combustivel")
@RequiredArgsConstructor
public class TipoDeCombustivelController {
    
    private final TipoDeCombustivelService tipoDeCombustivelService;

    @PostMapping()
    public ResponseEntity<TipoDeCombustivelEntity> cadastrarCombustivel(@RequestBody TipoDeCombustivelEntity tipoDeCombustivel) {
        return ResponseEntity.ok().body(tipoDeCombustivelService.cadastrarTipoDeCombustivel(tipoDeCombustivel));
    }

    @GetMapping()
    public ResponseEntity<List<TipoDeCombustivelEntity>> listarCombustiveis() {
        return ResponseEntity.ok().body(tipoDeCombustivelService.listarTipoDeCombustivel());
    }

     @GetMapping("/tipo")
    public ResponseEntity<List<TipoDeCombustivelEntity>> listarCombustivelPorNome(@RequestParam String nomeCombustivel) {
        return ResponseEntity.ok().body(tipoDeCombustivelService.listarCombustivelPorNome(nomeCombustivel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoDeCombustivelEntity> editarPrecoDoCombustivel(@PathVariable long id, @RequestBody @Valid TipoDeCombustivelDTO request) {
        return ResponseEntity.ok().body(tipoDeCombustivelService.editarPrecoDoCombustivel(id, request.novoPrecoLitro()));
    }
    

    
    
}
