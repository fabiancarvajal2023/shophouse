package com.fabian.backend.shophouse.ventas.database.dao;

import com.fabian.backend.shophouse.ventas.database.modelo.ProductoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoVentaRepository extends JpaRepository<ProductoVenta, Long> {

}
