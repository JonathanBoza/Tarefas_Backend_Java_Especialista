package br.com.ebac.meme_service.services;

import br.com.ebac.meme_service.entities.Meme;
import br.com.ebac.meme_service.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoMeme {
    @Autowired
    private RepositorioMeme repositorioMeme;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

}
