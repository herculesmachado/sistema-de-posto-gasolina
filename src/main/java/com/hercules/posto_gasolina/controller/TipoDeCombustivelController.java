package com.hercules.posto_gasolina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hercules.posto_gasolina.services.TipoDeCombustivelService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tipo-de-combustivel")
@RequiredArgsConstructor
public class TipoDeCombustivelController {
    
    private final TipoDeCombustivelService tipoDeCombustivelService;
}
