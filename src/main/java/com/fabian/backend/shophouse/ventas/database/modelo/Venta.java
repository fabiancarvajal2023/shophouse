package com.fabian.backend.shophouse.ventas.database.modelo;

import com.fabian.backend.shophouse.cliente.database.model.Cliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "venta")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vent_fecha", nullable = false)
    private Long fecha;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cli_id", nullable = false)
    private Cliente cliente;

    @Column(name = "vent_total", nullable = false)
    private Integer ventaTotal;

    @Column(name = "vent_total_compra", nullable = false)
    private Integer ventaTotalCompra;
}
