package br.com.matertech.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientProducer clientProducer;

    @PostMapping("/acesso/{cliente}/{porta}")
    public Boolean login(@PathVariable(value = "cliente") String cliente, @PathVariable(value = "porta") int porta){
        Client newClient = new Client(cliente, porta);
        clientProducer.enviarAoKafka(newClient);
        return newClient.checkAcces();
    }
}
