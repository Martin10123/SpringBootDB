package com.app.proyecto.persistence.repository;

import com.app.proyecto.persistence.entity.CompraCliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraClienteRepository extends JpaRepository<CompraCliente, Long> {
    
    List<CompraCliente> findByClienteIdUsuario(Long idUsuario);
    List<CompraCliente> findByOperadorIdUsuario(Long idUsuario);
    
}
