package com.adfolks.alerts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class API {
    @Value("${client.name}")
    String name;
    @RequestMapping("/test")
    public String test(){
        return "Hello "+name;
    }
    @RequestMapping("/time")
    public String timeAPI(){
        return "Hello World!!!";
    }
}
