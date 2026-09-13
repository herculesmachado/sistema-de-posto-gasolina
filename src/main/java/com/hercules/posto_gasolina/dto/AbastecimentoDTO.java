package com.hercules.posto_gasolina.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@Builder 
public class AbastecimentoDTO {
    private Long clienteId;
    private Long tipoDeCombustivelId;
    private BigDecimal quantidadeDeCombustivel;
    private BigDecimal valorTotal;
}
