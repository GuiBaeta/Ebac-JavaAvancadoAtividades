package br.com.ebac.ebac_mongodb.repositorio;

import br.com.ebac.ebac_mongodb.modelo.Jogo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioJogo extends MongoRepository<Jogo, String> {
    long count();
}
