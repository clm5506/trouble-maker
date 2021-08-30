package com.safety.troublemaker.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClient {

    @Bean("jailRestTemplate")
    public RestTemplate restTemplate() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-host", "jailbase-jailbase.p.rapidapi.com");
        headers.add("x-rapidapi-key", "");
        return new RestTemplate();


    }
}
