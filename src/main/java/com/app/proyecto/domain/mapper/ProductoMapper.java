package com.app.proyecto.domain.mapper;

import com.app.proyecto.domain.dto.ProductoDTO;
import com.app.proyecto.persistence.entity.Producto;

public class ProductoMapper {
    public static Producto toEntityProducto(ProductoDTO productoDTO) {
        Producto producto = new Producto();
        
        producto.setIdProducto(productoDTO.getIdProducto());
        producto.setCantidad(productoDTO.getCantidad());
        producto.setCantidadAlmacenamiento(productoDTO.getCantidadAlmacenamiento());
        producto.setDisponibilidad(productoDTO.isDisponibilidad());
        producto.setNombreProducto(productoDTO.getNombreProducto());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setTipo(productoDTO.getTipo());
        
        return producto;
    }
    
    public static ProductoDTO toDtoProducto(Producto producto){
        ProductoDTO productoDTO = new ProductoDTO();
        
        productoDTO.setIdProducto(producto.getIdProducto());
        productoDTO.setCantidad(producto.getCantidad());
        productoDTO.setCantidadAlmacenamiento(producto.getCantidadAlmacenamiento());
        productoDTO.setDisponibilidad(producto.isDisponibilidad());
        productoDTO.setNombreProducto(producto.getNombreProducto());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setTipo(producto.getTipo());
        
        return productoDTO;
    }
}
