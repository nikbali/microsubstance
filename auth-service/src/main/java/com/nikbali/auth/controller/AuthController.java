package com.nikbali.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/auth"})
@RequiredArgsConstructor
public class AuthController {


    @Value("${p}")
    private String p;


    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok(p);
    }
}
