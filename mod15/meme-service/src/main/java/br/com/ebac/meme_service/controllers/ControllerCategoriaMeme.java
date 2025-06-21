package br.com.ebac.meme_service.controllers;

import br.com.ebac.meme_service.entities.CategoriaMeme;
import br.com.ebac.meme_service.services.ServicoCategoriaMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria-meme")
public class ControllerCategoriaMeme {

    private static final Logger logger = LoggerFactory.getLogger(ControllerCategoriaMeme.class);

    @Autowired
    private ServicoCategoriaMeme servicoCategoriaMeme;

    @GetMapping()
    public List<CategoriaMeme> buscaCategorias() {
        logger.info("Acesso à listagem de Categorias de Memes");
        return servicoCategoriaMeme.listaTodasCategorias();
    }

    @PostMapping()
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        CategoriaMeme nova = servicoCategoriaMeme.novaCategoriaMeme(categoriaMeme);
        logger.info("Nova categoria de meme cadastrada: {}", nova);
        return nova;
    }
}
