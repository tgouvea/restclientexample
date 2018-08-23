package com.tiagogouvea.feignclient.client;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MyFeignImplTest {

    private MyFeign restClient;

    @Before
    public void setUp(){
        restClient  = new MyFeignImpl();
    }

    @Test
    public void activate() throws Exception {
    	
        Object customerResponse = restClient.activate("client_credentials", "", "yourcliID", "yourSecretID");
        
        System.out.println("Teste: " + customerResponse);

        assertTrue(customerResponse!=null);

    }


}