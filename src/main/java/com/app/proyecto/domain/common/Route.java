package com.app.proyecto.domain.common;

public class Route {
    public static final String API = "api";
    
    // Usuario
    public static final String GUARDAR_USUARIO = "usuario";
    public static final String CONSULTAR_USUARIOS = "usuarios";
    public static final String INICIAR_SESION = "login";
    public static final String OBTENER_USUARIO_POR_ID = "usuario/{id}";
    
    // Producto
    public static final String CONSULTAR_PRODUCTOS = "productos";
    public static final String OBTENER_PRODUCTO = "producto/{id}";
    public static final String ACTUALIZAR_PRODUCTO = "producto";
    
    // CompraCliente
    public static final String GUARDAR_DETALLE_COMPRA = "detalle";
    public static final String OBTENER_DETALLES_COMPRA = "detalles";
    public static final String OBTENER_DETALLE_COMPRA = "detalle/{id}";
    public static final String OBTENER_DETALLES_COMPRA_CLIENTE = "detalle/{id}/cliente";
    public static final String OBTENER_DETALLES_COMPRA_OPERADOR = "detalle/{id}/operador";
    public static final String ACTUALIZAR_DETALLE_COMPRA = "detalle/{id}";
}
