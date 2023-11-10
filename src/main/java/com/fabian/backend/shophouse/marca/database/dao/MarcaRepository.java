package com.fabian.backend.shophouse.marca.database.dao;

import com.fabian.backend.shophouse.marca.database.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {

    @Query(value = "SELECT m FROM Marca m Where lower(m.nombre) like concat('%',:nombre,'%')")
    List<Marca> buscarMarcaPorNombre(String nombre);
}
