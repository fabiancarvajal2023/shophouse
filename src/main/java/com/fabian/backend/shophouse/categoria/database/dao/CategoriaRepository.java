package com.fabian.backend.shophouse.categoria.database.dao;

import com.fabian.backend.shophouse.categoria.database.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    @Query(value = "SELECT c FROM Categoria c Where lower(c.nombre) like concat('%',:nombre,'%')")
    List<Categoria> buscarCategoriasPorNombre(String nombre);
}
