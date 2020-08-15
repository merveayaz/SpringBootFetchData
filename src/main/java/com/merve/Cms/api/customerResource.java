package com.merve.Cms.api;


import com.merve.Cms.model.customer;
import com.merve.Cms.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class customerResource {
    @Autowired
    private customerService customerService;

    @PostMapping
    public customer addCustomer(@RequestBody customer customer){

        return customerService.addCustomer(customer);
    }

}
