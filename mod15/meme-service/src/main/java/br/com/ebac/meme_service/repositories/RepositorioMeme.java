package br.com.ebac.meme_service.repositories;

import br.com.ebac.meme_service.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}
