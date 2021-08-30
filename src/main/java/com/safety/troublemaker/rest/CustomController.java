package com.safety.troublemaker.rest;

import com.safety.troublemaker.model.PersonOfInterest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/safety")
public class CustomController {

    public RestTemplate restTemplate;

    public String jailbaseEndpoint;

    @Autowired
    public CustomController(@Qualifier("jailRestTemplate") RestTemplate restTemplate, @Value("${jailbase-endpoint}") String jailbaseEndpoint) {
        this.restTemplate = restTemplate;
        this.jailbaseEndpoint = jailbaseEndpoint;
    }

    @GetMapping("/searchName}")
    public String custom(RequestEntity<PersonOfInterest> requestEntity) {
        //esponseEntity<Object> response = restTemplate.getForEntity(jailbaseEndpoint,);
        return "custom";
    }
}