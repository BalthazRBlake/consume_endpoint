package org.dev.fhhf.consume_endpoint.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class JsonMapperConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
