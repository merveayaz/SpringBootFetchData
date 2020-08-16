package com.merve.Cms.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.merve.Cms.model.customer;
import org.springframework.stereotype.Component;

@Component
public class customerService {
    private int customerIDCount = 1;
    private List<customer> customerList = new CopyOnWriteArrayList<>();

    public customer addCustomer(customer customer) {
     customer.setCustomerID(customerIDCount);
     customerList.add(customer);
     customerList.add(customer);
     customerIDCount++;
     return customer;
    }

    public List<customer> getCustomers()
    {
        return customerList;
    }

    public customer getCustomer(int customerID)
    {
        return customerList
                .stream()
                .filter(c -> c.getCustomerID() == customerID)
                .findFirst()
                .get();

    }

    public customer updateCustomer(int customerID, customer customer)
    {
        customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerID() == customerID)
                    {
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });

        return customerList
                .stream()
                .filter(c -> c.getCustomerID() == customerID)
                .findFirst()
                .get();
    }

    public void deleteCustomer(int customerID)
    {

        customerList
                .stream()
                .forEach(c->{
                    if (c.getCustomerID() == customerID){
                        customerList.remove(c);
                    }
                        });

    }

}
