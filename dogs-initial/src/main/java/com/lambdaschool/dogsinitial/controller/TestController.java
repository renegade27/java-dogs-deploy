package com.lambdaschool.dogsinitial.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/")
    public ResponseEntity<?> getRoute() {
        return new ResponseEntity<>("This is the test route", HttpStatus.OK);
    }
}
