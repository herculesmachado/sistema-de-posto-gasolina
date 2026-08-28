package com.hercules.posto_gasolina.services;

import org.springframework.stereotype.Service;

import com.hercules.posto_gasolina.infrastructure.repositories.AbastecimentoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AbastecimentoService {
    private final AbastecimentoRepository abastecimentoRepository;
}
