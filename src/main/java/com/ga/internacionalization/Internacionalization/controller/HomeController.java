package com.ga.internacionalization.Internacionalization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
public class HomeController {

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @GetMapping(path = "/hello")
    public String helloInternacionalized(
            @RequestHeader(name = "Accept-Language", required = false)Locale locale){
        return messageSource.getMessage("application.hello", null, locale);
    }

}
