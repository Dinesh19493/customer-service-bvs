package com.customer.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.model.Customer;
import com.customer.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Optional<Customer> getCustomerById(UUID customerId) {

		return customerRepository.findById(customerId);
	}

	@Override
	public Customer saveNewCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void updateExistingCustomer(UUID customerId, Customer customer) throws Exception {
		if(customerRepository.findById(customerId) == null) throw new Exception("Customer ID not found");

		customerRepository.save(customer);
	}

	@Override
	public void deleteExistingCustomer(UUID customerId) throws Exception {
		if(customerRepository.findById(customerId) == null) throw new Exception("Customer ID not found");
		customerRepository.deleteById(customerId);
	}
}
