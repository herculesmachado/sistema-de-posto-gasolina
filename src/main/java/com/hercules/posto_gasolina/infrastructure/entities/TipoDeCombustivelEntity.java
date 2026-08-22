package com.hercules.posto_gasolina.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tipo_de_combustivel")
public class TipoDeCombustivelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "combustivel_seq")
    @SequenceGenerator(name = "combustivel_seq", sequenceName = "combustivel_seq", allocationSize = 1)
    private Long id;
    @Column(nullable = false, length = 255)
    private String nome;
    @Column(name = "preco_litro", precision = 10, scale = 2, nullable = false)
    private BigDecimal precoLitro;
}
