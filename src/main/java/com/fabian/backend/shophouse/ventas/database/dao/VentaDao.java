package com.fabian.backend.shophouse.ventas.database.dao;

import com.fabian.backend.shophouse.ventas.modelo.VentaRequest;

public interface VentaDao {

    boolean save(VentaRequest ventaRequest);
}
