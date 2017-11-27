package com.tiagogouvea.feignclient.client;

import com.tiagogouvea.feign.restexample.model.customer.Customer;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CustomerClientImpl implements CustomerClient {

    private CustomerClient restClient;

    private static final String BASE_URL = "http://localhost:8080";

    public CustomerClientImpl() {

        restClient = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(CustomerClient.class, BASE_URL);

    }

    @Override
    public Customer createCustomer(Customer customer) {
        return restClient.createCustomer(customer);
    }

    @Override
    public List<Customer> getAll() {
        return restClient.getAll();
    }
}
