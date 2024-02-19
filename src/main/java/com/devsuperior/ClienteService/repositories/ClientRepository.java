package com.devsuperior.ClienteService.repositories;

import com.devsuperior.ClienteService.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
