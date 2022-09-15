package co.develhope.envVariable2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Environment environment;

    @Value("${myCustomEnv.welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/custom")
public String getWelcomeMsg(){
       return environment.getProperty("myCustomEnv.welcomeMsg");
    }

    @GetMapping("/other")
    public String getAnotherWelcomeMsg() {
        return welcomeMsg;
    }

 }
