package com.fabian.backend.shophouse.marca.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "marca")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "mar_nombre", length = 50, nullable = false)
    private String nombre;
}
