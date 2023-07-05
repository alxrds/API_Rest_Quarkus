package dev.alexandre.controller;

import dev.alexandre.entity.Customer;
import dev.alexandre.service.CustomerService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/api/customer")
public class CustomerController {

    @Inject
    CustomerService service;

    @GET
    public List<Customer> retriveCustomers(){
        List<Customer> customers = new ArrayList<>();
        try{
            customers = service.findAllCustomers();
        }catch(Exception e){
            e.printStackTrace();
        }
        return customers;
    }

    @POST
    @Transactional
    public void addCustomer(Customer customer){
        service.addCustomer(customer);
    }

}
