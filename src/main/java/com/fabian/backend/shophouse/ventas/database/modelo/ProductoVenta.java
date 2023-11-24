package com.fabian.backend.shophouse.ventas.database.modelo;

import com.fabian.backend.shophouse.cliente.database.model.Cliente;
import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "productoventa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "vent_id", nullable = false)
    private Venta venta;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "prod_id", nullable = false)
    private Producto producto;

    @Column(name = "prod_vent_cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "prod_vent_precio", nullable = false)
    private Integer precioVenta;

    @Column(name = "prod_vent_precio_compra", nullable = false)
    private Integer precioCompra;
}
