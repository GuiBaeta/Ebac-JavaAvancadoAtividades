package br.com.ebac.ebac_mongodb.servico;

import br.com.ebac.ebac_mongodb.modelo.Jogo;
import br.com.ebac.ebac_mongodb.repositorio.RepositorioJogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = RepositorioJogo.class)
public class ServicoJogo {

    @Autowired
    private RepositorioJogo repositorioJogo;

    public Jogo criarJogo(Jogo jogo) {
        return repositorioJogo.insert(jogo);
    }

    public long count() {
        return repositorioJogo.count();
    }
}
