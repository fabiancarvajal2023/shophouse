package com.fabian.backend.shophouse.categoria.database.dao;

import com.fabian.backend.shophouse.categoria.database.modelo.Categoria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class CategoriaDaoImpl implements CategoriaDao{
    private final CategoriaRepository categoriaRepository;
    @Override
    public List<Categoria> getCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> getcategoriaPorNombre(String nombre) {
        return categoriaRepository.buscarCategoriasPorNombre(nombre);
    }
}
