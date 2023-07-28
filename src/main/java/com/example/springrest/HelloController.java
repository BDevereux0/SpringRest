package com.example.springrest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//commented out @RestController to avoid program blowing up due to multiple
//controllers.
//@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!";
    }

    @GetMapping("/goodBye")
    @ResponseBody
    public String goodBye(){
        return "Good Bye!";
    }
}
