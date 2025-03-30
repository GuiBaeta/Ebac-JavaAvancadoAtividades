package br.com.ebac.ebac_filas.consumidor;

import br.com.ebac.ebac_filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumir {
    @RabbitHandler
    public void consumirMensagem(String mensagem) {
        System.out.println("====================== RECEBENDO MENSAGEM ================");
        System.out.println("====================== " + mensagem);
        System.out.println("====================== FIM RECEBENDO MENSAGEM ================");
    }
}
