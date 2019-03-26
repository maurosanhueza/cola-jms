package examples.colajmsreceiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class ColaJmsReceiverApplication {

	private static Logger logger = LoggerFactory.getLogger(ColaJmsReceiverApplication.class);

	public static void main(String[] args) throws Exception {

		SpringApplication.run(ColaJmsReceiverApplication.class, args);
	}
}
