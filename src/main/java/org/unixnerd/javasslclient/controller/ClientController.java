package org.unixnerd.javasslclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.reactive.HttpComponentsClientHttpConnector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ClientController {

    @Value("${demo.server}")
    private String demoServer;

    private RestTemplate template;


    @GetMapping("/client")
    public String talkToServer() {
        template = new RestTemplate();

        ResponseEntity<String> response
                = template.getForEntity(demoServer + "/hello", String.class);

        return "server said: " + response.getBody();
    }

}
