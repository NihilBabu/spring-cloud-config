package com.adfolks.logics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logic")
public class Controller {
    @RequestMapping("/main")
    public String getLoginHome(){
        return "Main Business application logic";
    }
}
