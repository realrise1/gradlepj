package com.itfact.gradlepj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    

    @RequestMapping("/")
    public String test(){
        return "hello!";
    }
    
    @RequestMapping("/test2")
    public String test2(){
        return "hello222!";
    }

    @RequestMapping("/test3")
    public String test3(){
        return "hello333!";
    }
}
