package com.adfolks.alerts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class API {
    @Value("${client.name}")
    String name;
    @Value("${timeservice.url}")
    String timeUrl;

    @RequestMapping("/test")
    public String test(){
        return "Hello "+name;
    }
    @RequestMapping("/time")
    public String timeAPI(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(timeUrl,String.class);
    }
}
