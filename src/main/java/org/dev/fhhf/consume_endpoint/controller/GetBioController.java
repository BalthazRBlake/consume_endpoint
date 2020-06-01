package org.dev.fhhf.consume_endpoint.controller;

import org.dev.fhhf.consume_endpoint.model.Bio;
import org.dev.fhhf.consume_endpoint.model.People;
import org.dev.fhhf.consume_endpoint.service.ConsumeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class GetBioController {

    @Autowired
    private ConsumeApi consumeApi;

    @GetMapping("/bio/{userName}")
    public ResponseEntity<Bio> getBioByUserName(@PathVariable("userName") String userName) {
        Bio bio = consumeApi.getBioByUserName(userName);
        return ResponseEntity.ok(bio);
    }

    @GetMapping("/users/{offset}/{size}")
    public ResponseEntity<People> getUsersByPage(@PathVariable("offset") int offset, @PathVariable("size") int size) {
        People people = consumeApi.getUsersByPage(offset, size);
        return ResponseEntity.ok(people);
    }
}
