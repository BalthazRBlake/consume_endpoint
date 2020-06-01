package org.dev.fhhf.consume_endpoint.service;

import org.dev.fhhf.consume_endpoint.model.Bio;
import org.dev.fhhf.consume_endpoint.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TorreApiService implements ConsumeApi {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Bio getBioByUserName(String userName) {

        String url = "https://bio.torre.co/api/bios/" + userName;

        ResponseEntity<Bio> response = restTemplate.exchange(url, HttpMethod.GET,
                null, new ParameterizedTypeReference<Bio>() {});

        return response.getBody();
    }

    @Override
    public People getUsersByPage(int offset, int size) {

        String url = "https://search.torre.co/people/_search/";
        url += "?offset=" + offset;
        url += "&size=" + size;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>("", headers);

        ResponseEntity<People> resp = restTemplate.postForEntity( url, request , People.class );

        return resp.getBody();
    }
}
