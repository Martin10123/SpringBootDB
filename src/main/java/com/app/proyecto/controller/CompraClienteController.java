package com.app.proyecto.controller;

import com.app.proyecto.domain.common.Route;
import com.app.proyecto.domain.dto.CompraClienteDTO;
import com.app.proyecto.domain.service.CompraClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Route.API)
public class CompraClienteController {

    @Autowired
    private CompraClienteService compraClienteService;

    @PostMapping(Route.GUARDAR_DETALLE_COMPRA)
    public CompraClienteDTO guardarDetalleCompra(@RequestBody CompraClienteDTO compraClienteDTO) {
        return compraClienteService.guardarDetalleCompra(compraClienteDTO);
    }

    @GetMapping(value = Route.OBTENER_DETALLES_COMPRA)
    public ResponseEntity<List<CompraClienteDTO>> obtenerDetallesCompra() {
        return ResponseEntity.ok(compraClienteService.obtenerDetallesDeCompra());
    }

    @GetMapping(value = Route.OBTENER_DETALLES_COMPRA_CLIENTE)
    public ResponseEntity<List<CompraClienteDTO>> obtenerDetallesCompraCliente(@PathVariable("id") Long id) {
        return ResponseEntity.ok(compraClienteService.obtenerDetallesDeCompraCliente(id));
    }

    @GetMapping(value = Route.OBTENER_DETALLES_COMPRA_OPERADOR)
    public ResponseEntity<List<CompraClienteDTO>> obtenerDetallesCompraOperador(@PathVariable("id") Long id) {
        return ResponseEntity.ok(compraClienteService.obtenerDetallesDeCompraOperador(id));
    }

    @GetMapping(value = Route.OBTENER_DETALLE_COMPRA)
    public ResponseEntity<CompraClienteDTO> obtenerUnDetalleCompra(@PathVariable("id") Long id) {
        return ResponseEntity.ok(compraClienteService.obtenerUnDetalleCompra(id));
    }

    @PutMapping(value = Route.ACTUALIZAR_DETALLE_COMPRA)
    public ResponseEntity<CompraClienteDTO> actualizarDetalleCompra(@RequestBody CompraClienteDTO compraClienteDTO) {
        return ResponseEntity.ok(compraClienteService.actualizarDetalleCompra(compraClienteDTO));
    }

}
