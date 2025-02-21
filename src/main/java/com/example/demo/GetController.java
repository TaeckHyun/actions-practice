package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @GetMapping(value = "/test/hello")
    public String hello(){
        return "Hello World";
    }
}
