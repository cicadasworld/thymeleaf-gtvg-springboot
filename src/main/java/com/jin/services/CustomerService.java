package com.jin.services;

import com.jin.entities.Customer;
import com.jin.entities.repositories.CustomerRepository;

import java.util.List;

public class CustomerService {

    public List<Customer> listAll() {
        return CustomerRepository.getInstance().findAll();
    }

    public Customer getById(Integer id) {
        return CustomerRepository.getInstance().findById(id);
    }
}
