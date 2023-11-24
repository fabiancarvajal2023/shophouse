package com.fabian.backend.shophouse.cliente.database.dao;

import com.fabian.backend.shophouse.cliente.model.ClienteRequest;
import com.fabian.backend.shophouse.cliente.model.LoginResponse;

public interface ClienteDao {
    LoginResponse login(String email, String password);

    Long save(ClienteRequest clienteRequest);
}
