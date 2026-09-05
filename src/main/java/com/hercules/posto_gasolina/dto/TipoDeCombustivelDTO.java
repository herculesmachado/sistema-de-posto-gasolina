package com.hercules.posto_gasolina.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record TipoDeCombustivelDTO(
    @NotNull 
    @Positive
    BigDecimal novoPrecoLitro
) {}
