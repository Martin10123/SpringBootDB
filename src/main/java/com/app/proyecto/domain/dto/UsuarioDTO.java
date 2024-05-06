package com.app.proyecto.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long idUsuario;
    private String nombreCompleto;
    private String email;
    private String password;
    private String direccion;
    private String telefono;
    private String tipoUsuario;
    private String categoria;
}
