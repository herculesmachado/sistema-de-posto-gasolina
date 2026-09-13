package com.hercules.posto_gasolina.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hercules.posto_gasolina.dto.AbastecimentoDTO;
import com.hercules.posto_gasolina.infrastructure.entities.AbastecimentoEntity;
import com.hercules.posto_gasolina.infrastructure.entities.ClienteEntity;
import com.hercules.posto_gasolina.infrastructure.entities.TipoDeCombustivelEntity;
import com.hercules.posto_gasolina.infrastructure.repositories.AbastecimentoRepository;
import com.hercules.posto_gasolina.infrastructure.repositories.ClienteRepository;
import com.hercules.posto_gasolina.infrastructure.repositories.TipoDeCombustivelRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AbastecimentoService {
    private final AbastecimentoRepository abastecimentoRepository;
    private final ClienteRepository clienteRepository;
    private final TipoDeCombustivelRepository tipoDeCombustivelRepository ;

    public AbastecimentoEntity cadastrarAbastecimento(AbastecimentoDTO dto) {
        ClienteEntity cliente = clienteRepository.findById(dto.getClienteId())
            .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));

        TipoDeCombustivelEntity combustivel = tipoDeCombustivelRepository.findById(dto.getTipoDeCombustivelId())
            .orElseThrow(() -> new EntityNotFoundException("Tipo de combustível não encontrado"));

        AbastecimentoEntity abastecimento = AbastecimentoEntity.builder()
            .cliente(cliente)
            .tipoDeCombustivel(combustivel)
            .quantidadeDeCombustivel(dto.getQuantidadeDeCombustivel())
            .valorTotal(dto.getValorTotal())
            .build();

        return abastecimentoRepository.save(abastecimento);
    }

    public List<AbastecimentoEntity> listarAbastecimento(LocalDate data) {
        LocalDateTime dataInicial = data.atStartOfDay();
        LocalDateTime dataFinal = data.plusDays(1).atStartOfDay();
        return abastecimentoRepository.findByDataHoraRegistroAbastecimentoBetween(dataInicial, dataFinal);
    }
}
