package com.fabian.backend.shophouse.cliente.database.model;

import com.fabian.backend.shophouse.tipoidentificacion.database.model.TipoIdentificacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_id")
    private TipoIdentificacion tipoIdentificacion;
    @Column(name = "cli_identificacion", length = 20, nullable = false)
    private String identificacion;
    @Column(name = "cli_nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "cli_email", length = 100, nullable = false, unique = true)
    private String email;
    @Column(name = "cli_password", length = 256, nullable = false)
    private String password;
    @Column(name = "cli_direccion", length = 100)
    private String direccion;
    @Column(name = "cli_telefono", length = 20)
    private String telefono;
}
