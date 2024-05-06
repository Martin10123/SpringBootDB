package com.app.proyecto.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioIniciarDTO {
    private String email;
    private String password;
}
