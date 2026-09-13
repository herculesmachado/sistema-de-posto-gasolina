package com.hercules.posto_gasolina.infrastructure.repositories;

import com.hercules.posto_gasolina.infrastructure.entities.AbastecimentoEntity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;


public interface AbastecimentoRepository extends JpaRepository<AbastecimentoEntity, Long> {
    
    @Query("""
    SELECT a
    FROM AbastecimentoEntity a
    WHERE a.dataHoraRegistroAbastecimento >= :dataInicial
      AND a.dataHoraRegistroAbastecimento < :dataFinal
    """)
    List<AbastecimentoEntity> findByDataHoraRegistroAbastecimentoBetween(
        LocalDateTime dataInicial,
        LocalDateTime dataFinal
    );
}
