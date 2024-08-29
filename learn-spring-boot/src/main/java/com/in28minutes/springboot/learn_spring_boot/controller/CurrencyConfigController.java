package com.in28minutes.springboot.learn_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.learn_spring_boot.config.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigController {
    @Autowired
    CurrencyServiceConfiguration currencyServiceConfiguration;
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getAllConfiguration(){
        return currencyServiceConfiguration;
    }
}
