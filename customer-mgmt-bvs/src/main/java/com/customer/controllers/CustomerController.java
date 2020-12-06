package com.customer.controllers;

import org.springframework.http.HttpHeaders;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.services.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping(path = "/{customerId}")
	public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable("customerId") UUID customerId) {
		
		return new ResponseEntity<>(customerService.getCustomerById(customerId) , HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		
		Customer savedCustomer = customerService.saveNewCustomer(customer);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", "/api/v1/beer/" +savedCustomer.getCustomerId().toString());
		
		return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
	}
	
	@PutMapping({"/{customerId}"})
	public ResponseEntity<Customer> updateCustomerById(@PathVariable("customerId") UUID customerId, @RequestBody Customer customer) throws Exception {
		
		customerService.updateExistingCustomer(customerId, customer);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping({"/{customerId}"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomerById(@PathVariable("customerId") UUID customerId) throws Exception {
		
		customerService.deleteExistingCustomer(customerId);
	}
	
}
