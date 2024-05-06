package com.app.proyecto.controller;

import com.app.proyecto.domain.common.Route;
import com.app.proyecto.domain.dto.UsuarioDTO;
import com.app.proyecto.domain.dto.UsuarioIniciarDTO;
import com.app.proyecto.domain.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Route.API)
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = Route.GUARDAR_USUARIO)
    public ResponseEntity<UsuarioDTO> guardarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO savedUsuarioDTO = usuarioService.guardarUsuario(usuarioDTO);
        
        return ResponseEntity.ok(savedUsuarioDTO);
    }

    @GetMapping(value = Route.CONSULTAR_USUARIOS)
    public List<UsuarioDTO> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping(value = Route.INICIAR_SESION)
    public ResponseEntity<UsuarioDTO> obtenerUsuario(@RequestBody UsuarioIniciarDTO usuarioIniciarDTO) {

        UsuarioDTO usuario = usuarioService.obtenerUsuario(usuarioIniciarDTO.getEmail(), usuarioIniciarDTO.getPassword());

        return ResponseEntity.ok(usuario);
    }

    @GetMapping(value = Route.OBTENER_USUARIO_POR_ID)
    public UsuarioDTO obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

}
