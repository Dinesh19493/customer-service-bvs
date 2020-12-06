package com.customer.services;

import java.util.Optional;
import java.util.UUID;

import com.customer.model.Customer;

public interface CustomerService {

	Optional<Customer> getCustomerById(UUID customerId);

	Customer saveNewCustomer(Customer customer);

	void updateExistingCustomer(UUID customerId, Customer customer) throws Exception;

	void deleteExistingCustomer(UUID customerId) throws Exception;

}
