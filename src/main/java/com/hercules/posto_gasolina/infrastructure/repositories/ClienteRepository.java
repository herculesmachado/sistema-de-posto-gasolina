package com.hercules.posto_gasolina.infrastructure.repositories;

import com.hercules.posto_gasolina.infrastructure.entities.ClienteEntity;

import jakarta.transaction.Transactional;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    @Transactional
    void deleteById(Long id);
}
