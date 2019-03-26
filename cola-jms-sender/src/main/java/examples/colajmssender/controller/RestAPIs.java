package examples.colajmssender.controller;

import examples.colajmssender.jms.JmsProducer;
import examples.colajmssender.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestAPIs {
	
	@Autowired
	JmsProducer jmsProducer;
	
	@PostMapping(value="/api/customer")
	public Customer postCustomer(@RequestBody Customer customer){
		jmsProducer.send(customer);
		return customer;
	}

}
