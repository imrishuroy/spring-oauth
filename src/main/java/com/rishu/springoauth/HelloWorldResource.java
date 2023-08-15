package com.rishu.springoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/")
    public String helloWorld(Authentication authentication){
        return authentication.getAuthorities().toString();
    }
    
}
