package springmvc.service;

import java.util.List;

import springmvc.dto.Customer;

public interface CustomerService {
	List<Customer> findCustomers();
	Customer findCustomerByName(String name);	
	
}
