package br.com.ebac.meme_service.repositories;

import br.com.ebac.meme_service.dtos.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuario-service", url = "http://localhost:8081") // Porta do usuario-service
public interface UsuarioClient {
    @GetMapping("/usuarios/{id}")
    UsuarioDTO getUsuarioPorId(@PathVariable Long id);
}
