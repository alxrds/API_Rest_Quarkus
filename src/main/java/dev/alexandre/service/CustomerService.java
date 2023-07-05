package dev.alexandre.service;

import dev.alexandre.entity.Customer;
import dev.alexandre.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepository repository;

    public List<Customer> findAllCustomers(){
        return repository.findAll().list();
    }

    public void addCustomer(Customer customer){
        repository.persist(customer);
    }
}
