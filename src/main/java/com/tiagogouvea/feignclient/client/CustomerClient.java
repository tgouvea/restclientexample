package com.tiagogouvea.feignclient.client;

import com.tiagogouvea.feign.restexample.model.customer.Customer;
import feign.Headers;
import feign.RequestLine;

import java.util.List;

@Headers("Accept: application/json")
public interface CustomerClient {


    static final String GET = "GET ";
    static final String POST = "POST ";

    static final String CREATE_CUSTOMER = POST + "/customers";
    static final String GET_CUSTOMERS = GET + "/customers";


    @Headers("Content-Type: application/json")
    @RequestLine(CREATE_CUSTOMER)
    Customer createCustomer(Customer customerRequest);

    @Headers("Content-Type: application/json")
    @RequestLine(GET_CUSTOMERS)
    List<Customer> getAll();

}
