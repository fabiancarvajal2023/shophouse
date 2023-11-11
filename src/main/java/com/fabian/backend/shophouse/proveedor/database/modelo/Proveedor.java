package com.fabian.backend.shophouse.proveedor.database.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proveedor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "prov_nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "prov_direccion", length = 100)
    private String direccion;
    @Column(name = "prov_telefono", length = 20)
    private String telefono;
}
