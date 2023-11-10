package com.fabian.backend.shophouse.tipoidentificacion.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipoidentificacion")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoIdentificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tipo_nombre", length = 30, nullable = false)
    private String nombre;
    @Column(name = "tipo_abreviatura", length = 5)
    private String abreviatura;
}
