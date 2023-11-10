package com.fabian.backend.shophouse.categoria.database.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cat_nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "cat_imagen", length = 30)
    private String imagen;
}
