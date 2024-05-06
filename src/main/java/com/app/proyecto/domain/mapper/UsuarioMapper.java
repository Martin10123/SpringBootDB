package com.app.proyecto.domain.mapper;

import com.app.proyecto.domain.dto.UsuarioDTO;
import com.app.proyecto.persistence.entity.Usuario;

public class UsuarioMapper {
    
    public static Usuario toEntityUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        
        usuario.setNombreCompleto(usuarioDTO.getNombreCompleto());
        usuario.setDireccion(usuarioDTO.getDireccion());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setTelefono(usuarioDTO.getTelefono());
        usuario.setTipoUsuario(usuarioDTO.getTipoUsuario());
        usuario.setCategoria(usuarioDTO.getCategoria());
        
        return usuario;
    }
    
    public static UsuarioDTO toDtoUsuario(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        
        usuarioDTO.setIdUsuario(usuario.getIdUsuario());
        usuarioDTO.setNombreCompleto(usuario.getNombreCompleto());
        usuarioDTO.setDireccion(usuario.getDireccion());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setTelefono(usuario.getTelefono());
        usuarioDTO.setTipoUsuario(usuario.getTipoUsuario());
        usuarioDTO.setCategoria(usuario.getCategoria());
        
        return usuarioDTO;
    }
    
}
