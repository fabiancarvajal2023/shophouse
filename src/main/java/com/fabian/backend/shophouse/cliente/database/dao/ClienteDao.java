package com.fabian.backend.shophouse.cliente.database.dao;

import com.fabian.backend.shophouse.cliente.model.ClienteRequest;

public interface ClienteDao {
    boolean login(String email, String password);

    Long save(ClienteRequest clienteRequest);
}
