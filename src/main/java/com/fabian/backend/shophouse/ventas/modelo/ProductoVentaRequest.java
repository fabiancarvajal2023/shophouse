package com.fabian.backend.shophouse.ventas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoVentaRequest {

    private Long producto;
    private Integer cantidad;
    private Integer precioVenta;
    private Integer precioCompra;
}
