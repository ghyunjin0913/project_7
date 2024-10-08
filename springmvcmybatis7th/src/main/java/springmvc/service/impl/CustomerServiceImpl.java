package springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.CustomerDao;
import springmvc.dto.Customer;
import springmvc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	@Resource
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> findCustomers() {
		List<Customer> customerList =
				customerDao.findCustomers();
		
		return customerList;
	}

	@Override
	public Customer findCustomerByName(String name) {
		Customer customer = 
				customerDao.findCustomerByName(name);
		
		return customer;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
}
