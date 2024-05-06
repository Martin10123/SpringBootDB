package com.app.proyecto.domain.service;

import com.app.proyecto.domain.dto.ProductoDTO;
import com.app.proyecto.domain.mapper.ProductoMapper;
import com.app.proyecto.persistence.repository.ProductoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoDTO> consultarProductos() {
        return productoRepository.findAll().stream().map(ProductoMapper::toDtoProducto).collect(Collectors.toList()); 
    }

    public ProductoDTO actualizarProducto(ProductoDTO productoDTO) {
        
        productoRepository.save(ProductoMapper.toEntityProducto(productoDTO));
        
        return productoDTO;
    }
    
    public ProductoDTO obtenerProducto(Long id) {
        return ProductoMapper.toDtoProducto(productoRepository.findById(id).orElse(null));
    }

}
