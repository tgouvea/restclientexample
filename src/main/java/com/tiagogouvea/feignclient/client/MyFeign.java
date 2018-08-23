package com.tiagogouvea.feignclient.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface MyFeign {

    static final String POST = "POST ";
    
    static final String CREATE_TOKEN = POST + "/oauthpath";
	
    
    @RequestLine(CREATE_TOKEN)
    @Headers("Content-Type: application/x-www-form-urlencoded")
    Object activate(@Param("grant_type") String grant_type, @Param("scope") String scope, @Param("client_id") String client_id, @Param("client_secret") String client_secret);
}