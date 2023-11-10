package com.fabian.backend.shophouse.tipoidentificacion.database.dao;

import com.fabian.backend.shophouse.tipoidentificacion.database.model.TipoIdentificacion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TipoIdentificacionDaoImpl implements TipoIdentificacionDao {
    private final TipoIdentificacionRepository tipoIdentificacionRepository;

    @Override
    public List<TipoIdentificacion> getTiposIdentificacion() {
        return tipoIdentificacionRepository.findAll();
    }

    @Override
    public TipoIdentificacion getTipoIdentificacion(Integer id) {
        Optional<TipoIdentificacion> query = tipoIdentificacionRepository.findById(id);
        return query.get();
    }
}
