package com.hercules.posto_gasolina.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    @Column(insertable = false)
    @CreationTimestamp
    private LocalDateTime dataHoraRegistro;
}
