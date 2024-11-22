package com.mark.springsecurityex;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest httpServletRequest)
    {

        return "Welcome : " + httpServletRequest.getSession().getId() ;
    }

    @GetMapping("/home")
    public String home(){

        return "I am Home !";
    }
}
