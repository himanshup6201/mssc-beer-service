package web.services;

import org.springframework.stereotype.Service;
import web.model.CustomerDTO;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Joe Back")
                .build();
    }
}
