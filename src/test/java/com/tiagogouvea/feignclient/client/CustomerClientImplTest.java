package com.tiagogouvea.feignclient.client;

import com.tiagogouvea.feign.restexample.model.customer.Customer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerClientImplTest {

    private CustomerClient restClient;

    @Before
    public void setUp(){
        restClient  = new CustomerClientImpl();
    }

    @Test
    public void createCustomer() throws Exception {

        Customer customer = new Customer();

        customer.setName("test");
        customer.setPhone("test");

        Customer customerResponse = restClient.createCustomer(customer);

        assertTrue(customerResponse!=null);

    }

    @Test
    public void getAll() throws Exception {
        List<Customer> customerResponses = restClient.getAll();
        assertTrue(customerResponses.size() >= 1);
    }

}