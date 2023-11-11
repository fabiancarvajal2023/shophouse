package com.fabian.backend.shophouse.producto.database.dao;

import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {
    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> buscarTodos(int page, int limit) {
        Page<Producto> pageList = productoRepository.buscarTodosConPaginacion(PageRequest.of(page, limit).withSort(Sort.by(Sort.Direction.ASC, "nombre")));
        return pageList.getContent();
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre, int page, int limit) {
        Page<Producto> pageList = productoRepository.buscarPorNombreConPaginacion(nombre, PageRequest.of(page, limit).withSort(Sort.by(Sort.Direction.ASC, "nombre")));
        return pageList.getContent();
    }

    @Override
    public List<Producto> buscarPorCategoria(Integer id, int page, int limit) {
        Page<Producto> pageList = productoRepository.buscarPorCategoriaConPaginacion(id, PageRequest.of(page, limit).withSort(Sort.by(Sort.Direction.ASC, "nombre")));
        return pageList.getContent();
    }

    @Override
    public List<Producto> buscarPorCategoriaYNombre(Integer id, String nombre, int page, int limit) {
        Page<Producto> pageList = productoRepository.buscarPorCategoriaYNombreConPaginacion(id, nombre, PageRequest.of(page, limit).withSort(Sort.by(Sort.Direction.ASC, "nombre")));
        return pageList.getContent();
    }
}
