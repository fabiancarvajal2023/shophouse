package com.fabian.backend.shophouse.producto.database.dao;

import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query(value = "SELECT p FROM Producto p Where lower(p.nombre) like concat('%',:nombre,'%')")
    List<Producto> buscarPorNombre(String nombre);

    @Query(value = "SELECT p FROM Producto p INNER JOIN p.categoria c where c.id =:id")
    List<Producto> buscarPorCategoria(Integer id);

    @Query(value = "SELECT p FROM Producto p INNER JOIN p.categoria c Where c.id =:id and lower(p.nombre) like concat('%',:nombre,'%')")
    List<Producto> buscarPorCategoriaYNombre(Integer id, String nombre);
}
