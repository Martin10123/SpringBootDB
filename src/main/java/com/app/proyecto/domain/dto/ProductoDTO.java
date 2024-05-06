package com.app.proyecto.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    private Long idProducto;
    private String nombreProducto;
    private double precio;
    private String tipo;
    private String cantidad;
    private int cantidadAlmacenamiento;
    private boolean disponibilidad;
}
