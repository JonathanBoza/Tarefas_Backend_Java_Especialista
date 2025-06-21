package br.com.ebac.meme_service.services;

import br.com.ebac.meme_service.entities.CategoriaMeme;
import br.com.ebac.meme_service.repositories.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoCategoriaMeme {
    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        // Setando valores padrão
        categoriaMeme.setDataCadastro(new java.sql.Date(System.currentTimeMillis()));
        categoriaMeme.setUsuarioId(1L); // ID padrão para teste
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
