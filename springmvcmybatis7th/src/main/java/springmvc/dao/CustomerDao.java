package springmvc.dao;

import java.util.List;

import springmvc.dto.Customer;

public interface CustomerDao {
	List<Customer> findCustomers();
	Customer findCustomerByName(String name);	
}
