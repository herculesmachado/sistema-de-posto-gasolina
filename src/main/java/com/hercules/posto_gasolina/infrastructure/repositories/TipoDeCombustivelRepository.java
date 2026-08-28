package com.hercules.posto_gasolina.infrastructure.repositories;

import com.hercules.posto_gasolina.infrastructure.entities.TipoDeCombustivelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository<TipoDeCombustivelEntity, Long> {
    TipoDeCombustivelEntity findByNome(String nome);
}
