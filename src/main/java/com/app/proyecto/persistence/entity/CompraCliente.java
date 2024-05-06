package com.app.proyecto.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COMPRACLIENTES")
public class CompraCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompraCliente;
    private int cantidadComprada;
    private double precioTotal;
    private String fechaCompra;
    private String fechaConfirmacion;
    private String direccionEnvio;
    private String estadoCompra;
    private String descripcionProducto;
    
    @ManyToOne
    @Cascade(CascadeType.DETACH)
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    @ManyToOne
    @Cascade(CascadeType.DETACH)
    @JoinColumn(name = "id_operador")
    private Usuario operador;
    
    @ManyToOne
    @Cascade(CascadeType.DETACH)
    @JoinColumn(name = "id_usuario")
    private Usuario cliente;
}
