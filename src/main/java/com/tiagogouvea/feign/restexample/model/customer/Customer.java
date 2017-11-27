package com.tiagogouvea.feign.restexample.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
public class Customer {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "phone")
    private String phone;

}
