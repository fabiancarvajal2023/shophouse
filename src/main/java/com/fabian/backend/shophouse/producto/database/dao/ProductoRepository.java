package com.fabian.backend.shophouse.producto.database.dao;

import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query(value = "SELECT p FROM Producto p")
    Page<Producto> buscarTodosConPaginacion(Pageable pageable);

    @Query(value = "SELECT p FROM Producto p Where lower(p.nombre) like concat('%',:nombre,'%')")
    Page<Producto> buscarPorNombreConPaginacion(String nombre, Pageable pageable);

    @Query(value = "SELECT p FROM Producto p INNER JOIN p.categoria c where c.id =:id")
    Page<Producto> buscarPorCategoriaConPaginacion(Integer id, Pageable pageable);

    @Query(value = "SELECT p FROM Producto p INNER JOIN p.categoria c Where c.id =:id and lower(p.nombre) like concat('%',:nombre,'%')")
    Page<Producto> buscarPorCategoriaYNombreConPaginacion(Integer id, String nombre, Pageable pageable);
}
