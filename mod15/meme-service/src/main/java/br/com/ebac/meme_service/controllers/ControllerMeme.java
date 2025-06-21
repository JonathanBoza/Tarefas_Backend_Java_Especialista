package br.com.ebac.meme_service.controllers;

import br.com.ebac.meme_service.entities.Meme;
import br.com.ebac.meme_service.services.ServicoMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meme")
public class ControllerMeme {

    private static final Logger logger = LoggerFactory.getLogger(ControllerMeme.class);

    @Autowired
    private ServicoMeme servicoMeme;

    @GetMapping()
    public List<Meme> buscaMemes() {
        logger.info("Acesso à listagem de memes");
        return servicoMeme.listaTodosMemes();
    }

    @PostMapping()
    public Meme novoMeme(@RequestBody Meme meme) {
        Meme novo = servicoMeme.novoMeme(meme);
        logger.info("Novo meme cadastrado: {}", novo);
        return novo;
    }
}
