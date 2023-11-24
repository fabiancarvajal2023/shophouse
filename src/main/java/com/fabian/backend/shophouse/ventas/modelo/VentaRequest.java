package com.fabian.backend.shophouse.ventas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VentaRequest {

    private Date fecha;
    private Long cliente;
    private Integer ventaTotal;
    private Integer ventaTotalCompra;
    private List<ProductoVentaRequest> productoVenta;
}
