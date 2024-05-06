package com.app.proyecto.controller;

import com.app.proyecto.domain.common.Route;
import com.app.proyecto.domain.dto.ProductoDTO;
import com.app.proyecto.domain.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Route.API)
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping(value = Route.CONSULTAR_PRODUCTOS)
    public ResponseEntity<List<ProductoDTO>> obtenerProductos() {
        List<ProductoDTO> listaProductos = this.productoService.consultarProductos();
        return ResponseEntity.ok(listaProductos);
    }
    
    @PutMapping(value = Route.ACTUALIZAR_PRODUCTO)
    public ResponseEntity<ProductoDTO> actualizarProducto(@RequestBody ProductoDTO productoDTO) {
        productoService.actualizarProducto(productoDTO);
        return ResponseEntity.ok(productoDTO);
    }
    
    @GetMapping(value = Route.OBTENER_PRODUCTO)
    public ResponseEntity<ProductoDTO> obtenerProducto(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productoService.obtenerProducto(id));
    }
}
