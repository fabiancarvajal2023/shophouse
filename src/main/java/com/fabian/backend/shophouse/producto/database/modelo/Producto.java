package com.fabian.backend.shophouse.producto.database.modelo;

import com.fabian.backend.shophouse.categoria.database.modelo.Categoria;
import com.fabian.backend.shophouse.marca.database.model.Marca;
import com.fabian.backend.shophouse.proveedor.database.modelo.Proveedor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "mar_id", nullable = false)
    private Marca marca;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cat_id", nullable = false)
    private Categoria categoria;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "prov_id")
    private Proveedor proveedor;

    @Column(name = "prod_imagen", length = 30, nullable = false)
    private String imagen;

    @Column(name = "prod_nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "prod_codigo_barras", length = 50, nullable = false)
    private String codigoBarras;

    @Column(name = "prod_precio_venta", nullable = false)
    private int precioVenta;

    @Column(name = "prod_precio_compra", nullable = false)
    private int precioCompra;
}
