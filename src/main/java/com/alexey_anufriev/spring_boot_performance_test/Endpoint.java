package com.alexey_anufriev.spring_boot_performance_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @GetMapping("/api/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

}
