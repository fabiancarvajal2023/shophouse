package com.fabian.backend.shophouse.cliente;

import com.fabian.backend.shophouse.cliente.database.dao.ClienteDao;
import com.fabian.backend.shophouse.cliente.model.ClienteRequest;
import com.fabian.backend.shophouse.cliente.model.LoginRequest;
import com.fabian.backend.shophouse.cliente.model.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cliente")
@RequiredArgsConstructor
public class ClienteController {

    @Autowired
    private ClienteDao clienteDao;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return clienteDao.login(loginRequest.getEmail(), loginRequest.getPassword());
    }

    @PostMapping("/registrar")
    public Long registrarCliente(@RequestBody ClienteRequest clienteRequest) {
        return clienteDao.save(clienteRequest);
    }

}
