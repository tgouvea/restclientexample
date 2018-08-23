package com.tiagogouvea.feignclient.client;

import feign.Feign;
import feign.form.FormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class MyFeignImpl implements MyFeign {
    
    private MyFeign client;

    private static final String BASE_URL = "yourdomain";

    public MyFeignImpl() {

    	client = Feign.builder()
    			.encoder(new FormEncoder(new JacksonEncoder())).decoder(new JacksonDecoder())
                .target(MyFeign.class, BASE_URL);

    }

	@Override
	public Object activate(String grant_type, String scope, String client_id, String client_secret) {
		return client.activate(grant_type, scope, client_id, client_secret);
	}



}
