package br.com.ebac.usuario_service.repositories;

import br.com.ebac.usuario_service.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
