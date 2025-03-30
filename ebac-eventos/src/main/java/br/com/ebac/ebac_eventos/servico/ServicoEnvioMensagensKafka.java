package br.com.ebac.ebac_eventos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServicoEnvioMensagensKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.ebac.nome.topico}")
    private String nomeTopicoEbac;

    public void enviarMensagem(String mensagem){
        System.out.println("==================== Enviando mensagem: " + mensagem);

        kafkaTemplate.send(nomeTopicoEbac, mensagem);
    }
}
