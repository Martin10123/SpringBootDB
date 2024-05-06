package com.app.proyecto.domain.service;

import com.app.proyecto.domain.dto.CompraClienteDTO;
import com.app.proyecto.domain.mapper.CompraClienteMapper;
import com.app.proyecto.persistence.entity.CompraCliente;
import com.app.proyecto.persistence.repository.CompraClienteRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraClienteService {

    @Autowired
    private CompraClienteRepository compraClienteRepository;

    public CompraClienteDTO guardarDetalleCompra(CompraClienteDTO compraClienteDTO) {
        compraClienteRepository.save(CompraClienteMapper.toEntityCompra(compraClienteDTO));
        return compraClienteDTO;
    }

    public List<CompraClienteDTO> obtenerDetallesDeCompra() {
        return compraClienteRepository.findAll().stream().map(CompraClienteMapper::toDtoCompra).collect(Collectors.toList());
    }

    public List<CompraClienteDTO> obtenerDetallesDeCompraCliente(Long id) {
        return compraClienteRepository.findByClienteIdUsuario(id).stream().map(CompraClienteMapper::toDtoCompra).collect(Collectors.toList());
    }

    public List<CompraClienteDTO> obtenerDetallesDeCompraOperador(Long id) {
        return compraClienteRepository.findByOperadorIdUsuario(id).stream().map(CompraClienteMapper::toDtoCompra).collect(Collectors.toList());
    }

    public CompraClienteDTO obtenerUnDetalleCompra(Long id) {
        return CompraClienteMapper.toDtoCompra(compraClienteRepository.findById(id).orElse(null));
    }

    public CompraClienteDTO actualizarDetalleCompra(CompraClienteDTO compraClienteDTO) {

        Optional<CompraCliente> oCompraCliente = compraClienteRepository.findById(compraClienteDTO.getIdCompraCliente());

        if (oCompraCliente.isPresent()) {
            CompraCliente compraClienteExistente = oCompraCliente.get();
            
            compraClienteExistente.setDescripcionProducto(compraClienteDTO.getDescripcionProducto());
            compraClienteExistente.setDireccionEnvio(compraClienteDTO.getDireccionEnvio());
            compraClienteExistente.setFechaConfirmacion(compraClienteDTO.getFechaConfirmacion());
            compraClienteExistente.setEstadoCompra(compraClienteDTO.getEstadoCompra());
            
            compraClienteRepository.save(compraClienteExistente);

            return compraClienteDTO;
        } else {
            return null;
        }

    }

}
