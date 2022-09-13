package com.example.demoone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ControllerClass {

    @GetMapping("/h1")
    public String getResponse(){
        return "Hello Precious";
    }
}
