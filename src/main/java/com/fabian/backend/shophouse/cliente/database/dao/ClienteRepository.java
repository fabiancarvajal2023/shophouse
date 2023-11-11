package com.fabian.backend.shophouse.cliente.database.dao;

import com.fabian.backend.shophouse.cliente.database.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query(value = "SELECT c FROM Cliente c Where c.email = :email and c.password = :password")
    Optional<Cliente> loginCliente(String email, String password);
}
