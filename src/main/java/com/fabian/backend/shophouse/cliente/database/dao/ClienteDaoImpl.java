package com.fabian.backend.shophouse.cliente.database.dao;

import com.fabian.backend.shophouse.cliente.database.model.Cliente;
import com.fabian.backend.shophouse.cliente.model.ClienteRequest;
import com.fabian.backend.shophouse.tipoidentificacion.database.dao.TipoIdentificacionRepository;
import com.fabian.backend.shophouse.tipoidentificacion.database.model.TipoIdentificacion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ClienteDaoImpl implements ClienteDao {

    private final ClienteRepository clienteRepository;
    private final TipoIdentificacionRepository tipoIdentificacionRepository;

    @Override
    public boolean login(String email, String password) {
        Optional <Cliente> cliente = clienteRepository.loginCliente(email, password);
        return cliente.isPresent();
    }

    @Override
    @Transactional
    public Long save(ClienteRequest clienteRequest) {
        Optional<TipoIdentificacion> tipoIdentificacion = tipoIdentificacionRepository.findById(clienteRequest.getTipoIdentificacion());
        Cliente cliente = new Cliente(
                null,
                tipoIdentificacion.get(),
                clienteRequest.getIdentificacion(),
                clienteRequest.getNombre(),
                clienteRequest.getEmail(),
                clienteRequest.getPassword(),
                clienteRequest.getDireccion(),
                clienteRequest.getTelefono()
        );
        return clienteRepository.save(cliente).getId();
    }
}
