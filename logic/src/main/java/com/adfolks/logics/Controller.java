package com.adfolks.logics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logic")
@RefreshScope
public class Controller {
    @Value("${client.name}")
    String clientName;

    @RequestMapping("/main")
    public String getLoginHome(){
        return "Client Name: ".concat(clientName) ;
    }
}
