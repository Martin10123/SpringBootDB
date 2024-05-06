package com.app.proyecto.domain.dto;

import com.app.proyecto.persistence.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraClienteDTO {
    private Long idCompraCliente;
    private int cantidadComprada;
    private double precioTotal;
    private String fechaCompra;
    private String fechaConfirmacion;
    private String direccionEnvio;
    private String estadoCompra;
    private String descripcionProducto;
    private Producto producto;
    private Usuario operador;
    private Usuario cliente;
}
