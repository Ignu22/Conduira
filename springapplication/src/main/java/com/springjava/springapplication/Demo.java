package com.springjava.springapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to new spring";
    }
}
