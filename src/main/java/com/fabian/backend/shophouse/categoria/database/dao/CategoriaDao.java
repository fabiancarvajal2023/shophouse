package com.fabian.backend.shophouse.categoria.database.dao;

import com.fabian.backend.shophouse.categoria.database.modelo.Categoria;

import java.util.List;

public interface CategoriaDao {

    List<Categoria> getCategorias();

    List<Categoria> getcategoriaPorNombre(String nombre);
}
