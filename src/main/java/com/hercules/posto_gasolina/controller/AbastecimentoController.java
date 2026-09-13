package com.hercules.posto_gasolina.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hercules.posto_gasolina.dto.AbastecimentoDTO;
import com.hercules.posto_gasolina.infrastructure.entities.AbastecimentoEntity;
import com.hercules.posto_gasolina.services.AbastecimentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/abastecimento")
@RequiredArgsConstructor
public class AbastecimentoController {
    private final AbastecimentoService abastecimentoService;

    @PostMapping
    public ResponseEntity<AbastecimentoEntity> cadastrarAbastecimento(@RequestBody AbastecimentoDTO abastecimentoRequest) {
        return ResponseEntity.ok().body(abastecimentoService.cadastrarAbastecimento(abastecimentoRequest));
    }

    @GetMapping("/data")
    public ResponseEntity<List<AbastecimentoEntity>> listarAbastecimentoPorData(@RequestParam LocalDate dataAbastecimento) {
        return ResponseEntity.ok().body(abastecimentoService.listarAbastecimento(dataAbastecimento));
    }
}
