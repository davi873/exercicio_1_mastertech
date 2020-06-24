package br.com.matertech.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientProducer {

    @Autowired
    private KafkaTemplate<String, Client> producer;

    public void enviarAoKafka(Client client){
        producer.send("spec2-davi-pires-1", client);
    }

}
