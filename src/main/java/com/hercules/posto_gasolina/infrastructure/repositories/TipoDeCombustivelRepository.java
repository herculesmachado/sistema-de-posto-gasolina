package com.hercules.posto_gasolina.infrastructure.repositories;

import com.hercules.posto_gasolina.infrastructure.entities.TipoDeCombustivelEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository<TipoDeCombustivelEntity, Long> {
    List<TipoDeCombustivelEntity> findByNome(String nome);
}
