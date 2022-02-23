package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Coucou from Episode 2 (not a star war)\n";
    }
    


}