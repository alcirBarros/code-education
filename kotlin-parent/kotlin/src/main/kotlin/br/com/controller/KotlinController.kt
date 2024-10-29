package br.com.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class KotlinController {

    @GetMapping
    fun postVerify(): ResponseEntity<HttpStatus> {
        return ResponseEntity.ok().body(HttpStatus.OK)
    }

    @GetMapping(path = ["customexception"])
    fun customException(): ResponseEntity<HttpStatus?>? {
        throw NullPointerException("Custom Exception Method Test")
    }
}
