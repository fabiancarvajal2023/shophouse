package com.fabian.backend.shophouse.marca.database.dao;

import com.fabian.backend.shophouse.marca.database.model.Marca;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class MarcaDaoImpl implements MarcaDao {


    private final MarcaRepository marcaRepository;

    @Override
    public List<Marca> getMarcas() {
        return marcaRepository.findAll();
    }

    @Override
    public List<Marca> getMarcaPorNombre(String nombre) {
        return marcaRepository.buscarMarcaPorNombre(nombre);
    }
}
