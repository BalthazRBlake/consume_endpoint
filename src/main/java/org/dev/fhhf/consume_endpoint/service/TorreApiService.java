package org.dev.fhhf.consume_endpoint.service;

import org.apache.http.impl.client.HttpClientBuilder;
import org.dev.fhhf.consume_endpoint.model.BioObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TorreApiService implements ConsumeApi {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void getBioByUserName(String userName) {

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

        String url = "https://bio.torre.co/api/bios/"+userName;

        ResponseEntity<BioObject> response =
                restTemplate.exchange(url, HttpMethod.GET,
                        null, new ParameterizedTypeReference<BioObject>() {});

        System.out.println("   :::   " + response.getBody());

    }
}
