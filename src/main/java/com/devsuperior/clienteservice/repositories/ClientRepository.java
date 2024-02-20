package com.devsuperior.clienteservice.repositories;

import com.devsuperior.clienteservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
