package com.merve.Cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.merve.Cms.service.customerService;
import com.merve.Cms.model.customer;
import com.merve.Cms.api.customerResource;

@RestController
public class HelloWorld {


    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return "Henlo b";
    }



}
