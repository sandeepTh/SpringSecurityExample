package com.example.springsecurityexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFormController {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome home<h1>";
    }

    @GetMapping("/user")
    public String greet(){
        return "<h1>Welcome User<h1>";
    }

    @GetMapping("/admin")
    public String userAccesControl(){
        return "<h1>Welcome admin<h1>";
    }
}
