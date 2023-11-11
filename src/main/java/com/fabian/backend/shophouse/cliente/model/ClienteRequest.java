package com.fabian.backend.shophouse.cliente.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteRequest {
    private Integer tipoIdentificacion;
    private String identificacion;
    private String nombre;
    private String email;
    private String password;
    private String direccion;
    private String telefono;
}
