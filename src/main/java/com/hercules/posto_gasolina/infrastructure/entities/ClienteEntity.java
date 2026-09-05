package com.hercules.posto_gasolina.infrastructure.entities;

import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1)
    private Long id;

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(length = 11)
    private String cpf;

    @Column(length = 11)
    private String telefoneCliente;
}
