package com.plumstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CleintController {

    @GetMapping
    ResponseEntity<?> getMethod() {
        return ResponseEntity.ok("Success");
    }
}