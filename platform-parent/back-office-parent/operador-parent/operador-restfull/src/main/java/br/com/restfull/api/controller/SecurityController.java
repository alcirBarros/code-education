package br.com.restfull.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;


@RestController
public class SecurityController {

    @RolesAllowed({ "admin", "user" })
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello All User");
    }
}
