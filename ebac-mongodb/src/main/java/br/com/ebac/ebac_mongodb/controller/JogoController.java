package br.com.ebac.ebac_mongodb.controller;

import br.com.ebac.ebac_mongodb.modelo.Jogo;
import br.com.ebac.ebac_mongodb.servico.ServicoJogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/jogos")
public class JogoController {
    @Autowired
    private ServicoJogo servicoJogo;

    @PostMapping
    public Jogo criaJogo(@RequestBody Jogo jogo) {
        return servicoJogo.criarJogo(jogo);
    }

    @GetMapping("/count")
    public long contaJogos() {
        return servicoJogo.count();
    }
}
