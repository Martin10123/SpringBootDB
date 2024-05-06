package com.app.proyecto.persistence.repository;

import com.app.proyecto.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
