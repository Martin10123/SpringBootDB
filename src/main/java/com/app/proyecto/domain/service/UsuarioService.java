package com.app.proyecto.domain.service;

import com.app.proyecto.domain.dto.UsuarioDTO;
import com.app.proyecto.domain.mapper.UsuarioMapper;
import com.app.proyecto.persistence.entity.Usuario;
import com.app.proyecto.persistence.repository.UsuarioRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.toEntityUsuario(usuarioDTO);
        
        Usuario savedUsuario = usuarioRepository.save(usuario);
        
        usuarioDTO.setIdUsuario(savedUsuario.getIdUsuario());
        
        return usuarioDTO;
    }

    public List<UsuarioDTO> obtenerUsuarios() {
        return usuarioRepository.findAll().stream().map(UsuarioMapper::toDtoUsuario).collect(Collectors.toList());
    }

    public UsuarioDTO obtenerUsuario(String email, String password) {
        return UsuarioMapper.toDtoUsuario(usuarioRepository.findByEmailAndPassword(email, password));
    }
    
    public UsuarioDTO obtenerUsuarioPorId(Long id) {
        return UsuarioMapper.toDtoUsuario(usuarioRepository.findById(id).orElse(null));
    }

}
