package com.fabian.backend.shophouse.marca.database.dao;

import com.fabian.backend.shophouse.marca.database.model.Marca;

import java.util.List;

public interface MarcaDao {

    List<Marca> getMarcas();

    List<Marca> getMarcaPorNombre(String nombre);
}
