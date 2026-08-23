package com.hercules.posto_gasolina.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.NotFound;
import tools.jackson.databind.node.StringNode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "abastecimento")
public class AbastecimentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abastecimento_seq")
    @SequenceGenerator(name = "abastecimento_seq", sequenceName = "abastecimento_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "combustivel_id", nullable = false)
    private TipoDeCombustivelEntity tipoDeCombustivel;


    @Column(nullable = false, precision = 10, scale = 3)
    private BigDecimal quantidadeDeCombustivel;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;

    @Column(insertable = false)
    @CreationTimestamp
    private LocalDateTime dataHoraAbastecimento;
}
