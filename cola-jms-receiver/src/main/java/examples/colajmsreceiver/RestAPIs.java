package examples.colajmsreceiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestAPIs {

    @Autowired
    private MessageStorage customerStorage;

    @GetMapping(value="/api/customers")
    public List<Customer> getAll(){
        List<Customer> customers = customerStorage.getAll();
        return customers;
    }

    @DeleteMapping(value="/api/customers/clear")
    public String clearCustomerStorage() {
        customerStorage.clear();
        return "Clear All CustomerStorage!";
    }
}
