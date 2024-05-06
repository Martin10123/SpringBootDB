package com.app.proyecto.domain.mapper;

import com.app.proyecto.domain.dto.CompraClienteDTO;
import com.app.proyecto.persistence.entity.CompraCliente;

public class CompraClienteMapper {

    public static CompraCliente toEntityCompra(CompraClienteDTO compraClienteDTO) {
        CompraCliente comCli = new CompraCliente();

        comCli.setCantidadComprada(compraClienteDTO.getCantidadComprada());
        comCli.setDescripcionProducto(compraClienteDTO.getDescripcionProducto());
        comCli.setDireccionEnvio(compraClienteDTO.getDireccionEnvio());
        comCli.setEstadoCompra(compraClienteDTO.getEstadoCompra());
        comCli.setFechaCompra(compraClienteDTO.getFechaCompra());
        comCli.setFechaConfirmacion(compraClienteDTO.getFechaConfirmacion());
        comCli.setPrecioTotal(compraClienteDTO.getPrecioTotal());
        comCli.setProducto(compraClienteDTO.getProducto());
        comCli.setCliente(compraClienteDTO.getCliente());
        comCli.setOperador(compraClienteDTO.getOperador());

        return comCli;
    }

    public static CompraClienteDTO toDtoCompra(CompraCliente compraCliente) {
        CompraClienteDTO comCliDTO = new CompraClienteDTO();

        comCliDTO.setIdCompraCliente(compraCliente.getIdCompraCliente());
        comCliDTO.setCantidadComprada(compraCliente.getCantidadComprada());
        comCliDTO.setDescripcionProducto(compraCliente.getDescripcionProducto());
        comCliDTO.setDireccionEnvio(compraCliente.getDireccionEnvio());
        comCliDTO.setEstadoCompra(compraCliente.getEstadoCompra());
        comCliDTO.setFechaCompra(compraCliente.getFechaCompra());
        comCliDTO.setFechaConfirmacion(compraCliente.getFechaConfirmacion());
        comCliDTO.setPrecioTotal(compraCliente.getPrecioTotal());
        comCliDTO.setProducto(compraCliente.getProducto());
        comCliDTO.setCliente(compraCliente.getCliente());
        comCliDTO.setOperador(compraCliente.getOperador());

        return comCliDTO;
    }
}
