package com.hercules.posto_gasolina.infrastructure.repositories;

import com.hercules.posto_gasolina.infrastructure.entities.AbastecimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<AbastecimentoEntity, Long> {

}
