package br.com.ebac.usuario_service.controllers;

import br.com.ebac.usuario_service.entities.Usuario;
import br.com.ebac.usuario_service.services.ServicoUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {

    private static final Logger logger = LoggerFactory.getLogger(ControllerUsuario.class);

    @Autowired
    private ServicoUsuario servicoUsuario;

    @GetMapping
    public List<Usuario> buscaUsuarios() {
        logger.info("Acesso à listagem de usuários");
        return servicoUsuario.listaTodosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        Usuario novo = servicoUsuario.novoUsuario(usuario);
        logger.info("Novo usuário cadastrado: {}", novo);
        return novo;
    }

}
