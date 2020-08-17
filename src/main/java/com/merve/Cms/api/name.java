package com.merve.Cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {

    @RequestMapping(value = "/name")
    public String sayName()
    {
         return "my name ...";
    }
}
