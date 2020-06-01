package org.dev.fhhf.consume_endpoint.controller;

import org.dev.fhhf.consume_endpoint.service.ConsumeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBioController {

    @Autowired
    private ConsumeApi consumeApi;

    @GetMapping("/Bio")
    public String getBioByUserName() {
        consumeApi.getBioByUserName("fabianhumbertohernandezforero");
        return "Hello";
    }
}
