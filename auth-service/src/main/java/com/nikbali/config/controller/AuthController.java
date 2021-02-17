package com.nikbali.config.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/auth"})
@RequiredArgsConstructor
public class AuthController {


    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Auth Service");
    }
}
