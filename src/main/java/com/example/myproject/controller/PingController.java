package com.example.myproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping("/ping")
    public String ping(){
        return "ping";
    }
}
// ping controller just used to know the application is working fine otr not.