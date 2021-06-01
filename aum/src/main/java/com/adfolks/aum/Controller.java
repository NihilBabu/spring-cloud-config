package com.adfolks.aum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aum")
public class Controller {
    @RequestMapping("/home-page")
    public String getLoginHome(){
        return "Welcome to login home page";
    }
}
