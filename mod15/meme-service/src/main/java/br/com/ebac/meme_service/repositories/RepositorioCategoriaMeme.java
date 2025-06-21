package br.com.ebac.meme_service.repositories;

import br.com.ebac.meme_service.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
