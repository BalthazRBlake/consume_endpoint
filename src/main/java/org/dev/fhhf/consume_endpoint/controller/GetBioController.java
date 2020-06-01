package org.dev.fhhf.consume_endpoint.controller;

import org.dev.fhhf.consume_endpoint.model.Bio;
import org.dev.fhhf.consume_endpoint.service.ConsumeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBioController {

    @Autowired
    private ConsumeApi consumeApi;

    @GetMapping("{userName}/Bio")
    public ResponseEntity<Bio> getBioByUserName(@PathVariable("userName") String userName) {
        Bio bio = consumeApi.getBioByUserName(userName);
        return ResponseEntity.ok(bio);
    }
}
