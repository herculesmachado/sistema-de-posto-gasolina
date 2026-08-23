package com.hercules.posto_gasolina.infrastructure.repositories;

import com.hercules.posto_gasolina.infrastructure.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {


}
