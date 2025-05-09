package br.com.ebac.ebac_eventos.configuracao;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {

    @Value("${kafka.ebac.nome.topico}")
    private String nomeTopicoEbac;

    @Bean
    public NewTopic topicoEbac() {
        return TopicBuilder.name(nomeTopicoEbac).partitions(3).replicas(2).build();
    }
}
