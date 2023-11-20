package com.fabian.backend.shophouse.producto.database.dao;

import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {
    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> buscarTodos() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.buscarPorNombre(nombre);
    }

    @Override
    public List<Producto> buscarPorCategoria(Integer id) {
        return productoRepository.buscarPorCategoria(id);
    }

    @Override
    public List<Producto> buscarPorCategoriaYNombre(Integer id, String nombre) {
        return productoRepository.buscarPorCategoriaYNombre(id, nombre);
    }
}
