package com.hercules.posto_gasolina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hercules.posto_gasolina.services.AbastecimentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/abastecimento")
@RequiredArgsConstructor
public class AbastecimentoController {
    private final AbastecimentoService abastecimentoService;
}
