package br.com.matertech.consumer;



import br.com.matertech.kafka.Client;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.PrintWriter;

@Component
public class ClientConsumer {

    @KafkaListener(topics = "spec2-davi-pires-1", groupId = "group1")
    public void readAccess(@Payload Client client){
        try {
            String log = "O usuário " + client.getName() + " possui acesso " + client.getAcess() + " a porta " + client.getPort();
            FileWriter fileWriter = new FileWriter("./log_kafka.csv",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.append(log);
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
