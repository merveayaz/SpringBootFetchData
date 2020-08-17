package com.merve.Cms.api;


import com.merve.Cms.model.customer;
import com.merve.Cms.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class customerResource {
    @Autowired
    private customerService customerService;

    @PostMapping
    public customer addCustomer(@RequestBody customer customer){

        return customerService.addCustomer(customer);
    }

    @GetMapping
   public List<customer> getCustomers()
   {
       return customerService.getCustomers();
   }

   @GetMapping(value = "/{customerID}")
    public customer getCustomer(@PathVariable("customerID") int customerID){

        return customerService.getCustomer(customerID);
    }

    @PutMapping(value = "/{customerID}")
    public customer updateCustomer(@PathVariable("customerID") int customerID,@RequestBody customer customer){

        return customerService.updateCustomer(customerID,customer);
    }

}
