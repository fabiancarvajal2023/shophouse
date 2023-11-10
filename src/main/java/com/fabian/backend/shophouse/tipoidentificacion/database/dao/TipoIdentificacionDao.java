package com.fabian.backend.shophouse.tipoidentificacion.database.dao;

import com.fabian.backend.shophouse.tipoidentificacion.database.model.TipoIdentificacion;

import java.util.List;

public interface TipoIdentificacionDao {

    List<TipoIdentificacion> getTiposIdentificacion();
    TipoIdentificacion getTipoIdentificacion(Integer id);
}
