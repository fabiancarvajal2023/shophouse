package com.fabian.backend.shophouse.tipoidentificacion.database.dao;

import com.fabian.backend.shophouse.tipoidentificacion.database.model.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {

}
