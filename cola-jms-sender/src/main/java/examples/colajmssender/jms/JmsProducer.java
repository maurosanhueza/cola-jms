package examples.colajmssender.jms;

import examples.colajmssender.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

	private static Logger logger = LoggerFactory.getLogger(JmsProducer.class);

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${activemq.queue}")
	String queue;
	
	public void send(Customer customer){
		try{
			jmsTemplate.convertAndSend(queue, customer);
		}catch (Exception e){
			logger.debug(e.getMessage());
			e.printStackTrace();
		}
	}

}