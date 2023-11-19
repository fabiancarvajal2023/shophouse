package com.fabian.backend.shophouse.promocion.database.modelo;

import com.fabian.backend.shophouse.categoria.database.modelo.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "promocion")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cat_id", nullable = false)
    private Categoria categoria;


    @Column(name = "prom_porcent", nullable = false)
    private Integer porcentaje;

    @Column(name = "prom_articulo_req", nullable = false)
    private Boolean articuloRequerido;
}
