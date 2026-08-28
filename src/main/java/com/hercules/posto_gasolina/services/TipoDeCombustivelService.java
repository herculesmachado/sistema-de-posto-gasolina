package com.hercules.posto_gasolina.services;

import com.hercules.posto_gasolina.infrastructure.repositories.TipoDeCombustivelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TipoDeCombustivelService {
    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;
}
