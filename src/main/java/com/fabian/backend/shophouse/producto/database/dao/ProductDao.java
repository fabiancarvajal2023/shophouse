package com.fabian.backend.shophouse.producto.database.dao;

import com.fabian.backend.shophouse.producto.database.modelo.Producto;

import java.util.List;

public interface ProductDao {

    List<Producto> buscarTodos(int page, int limit);

    List<Producto> buscarPorNombre(String nombre, int page, int limit);

    List<Producto> buscarPorCategoria(Integer id, int page, int limit);

    List<Producto> buscarPorCategoriaYNombre(Integer id, String nombre, int page, int limit);
}
