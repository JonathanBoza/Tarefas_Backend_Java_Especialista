package br.com.ebac.meme_service.services;

import br.com.ebac.meme_service.entities.CategoriaMeme;
import br.com.ebac.meme_service.entities.Meme;
import br.com.ebac.meme_service.repositories.RepositorioCategoriaMeme;
import br.com.ebac.meme_service.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoMeme {
    @Autowired
    private RepositorioMeme repositorioMeme;

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public Meme novoMeme(Meme meme) {
        // Buscar a categoria pelo ID
        CategoriaMeme categoria = repositorioCategoriaMeme.findById(meme.getCategoriaMeme().getId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        // Setando valores padrão
        meme.setCategoriaMeme(categoria);
        meme.setDataCadastro(new java.sql.Date(System.currentTimeMillis()));
        meme.setUsuarioId(1L); // ID padrão para teste
        meme.setUrl("https://example.com/meme.jpg"); // URL padrão para teste

        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

}
