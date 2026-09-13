package com.hercules.posto_gasolina.infrastructure.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id")
    @SequenceGenerator(name = "cliente_id", sequenceName = "cliente_id", allocationSize = 1)
    private Long id;

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(length = 11)
    private String cpf;

    @Column(length = 11)
    private String telefoneCliente;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataHoraRegistroCliente;
}
