package com.hercules.posto_gasolina.services;

import com.hercules.posto_gasolina.infrastructure.entities.TipoDeCombustivelEntity;
import com.hercules.posto_gasolina.infrastructure.repositories.TipoDeCombustivelRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TipoDeCombustivelService {
    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;


    public TipoDeCombustivelEntity cadastrarTipoDeCombustivel(TipoDeCombustivelEntity tipoDeCombustivel) {
    if (tipoDeCombustivel.getPrecoLitro() == null) {
        throw new IllegalArgumentException("O preço do combustível é obrigatório");
    }

    if (tipoDeCombustivel.getPrecoLitro().compareTo(BigDecimal.ZERO) < 0) {
        throw new IllegalArgumentException("O preço do combustível não pode ser menor que zero");
    }

    return tipoDeCombustivelRepository.save(tipoDeCombustivel);
}

    public List<TipoDeCombustivelEntity> listarTipoDeCombustivel() {
        return tipoDeCombustivelRepository.findAll();
    }

    public List<TipoDeCombustivelEntity> listarCombustivelPorNome(String nomeCombustivel) {
        return tipoDeCombustivelRepository.findByNome(nomeCombustivel);
    }

    public TipoDeCombustivelEntity editarPrecoDoCombustivel(long id,BigDecimal novoPrecoLitro) {
        TipoDeCombustivelEntity tipoDeCombustivelExistente = tipoDeCombustivelRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Tipo de combustivel não encontrado"));

        tipoDeCombustivelExistente.setPrecoLitro(novoPrecoLitro);

        return tipoDeCombustivelRepository.save(tipoDeCombustivelExistente);
    }
}
