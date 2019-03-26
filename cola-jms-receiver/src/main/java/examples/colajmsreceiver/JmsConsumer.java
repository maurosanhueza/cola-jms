package examples.colajmsreceiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
    @Autowired
    private MessageStorage customerStorage;

    @JmsListener(destination = "${activemq.queue}", containerFactory="jsaFactory")
    public void receive(String customer){
        System.out.println("Received Message: " + customer);
        //customerStorage.add(customer);
    }
}
