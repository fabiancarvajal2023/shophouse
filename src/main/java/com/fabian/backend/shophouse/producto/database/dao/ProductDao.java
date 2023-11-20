package com.fabian.backend.shophouse.producto.database.dao;

import com.fabian.backend.shophouse.producto.database.modelo.Producto;

import java.util.List;

public interface ProductDao {

    List<Producto> buscarTodos();

    List<Producto> buscarPorNombre(String nombre);

    List<Producto> buscarPorCategoria(Integer id);

    List<Producto> buscarPorCategoriaYNombre(Integer id, String nombre);
}
