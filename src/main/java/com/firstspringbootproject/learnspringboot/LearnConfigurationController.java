package com.firstspringbootproject.learnspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnConfigurationController {

    @Autowired
    private LearnServiceConfiguration configuration;
    @RequestMapping("/learn-configuration")
    public LearnServiceConfiguration retrieveConfigs(){
        return configuration;
    }

}
