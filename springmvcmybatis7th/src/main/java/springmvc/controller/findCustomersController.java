package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.service.CustomerService;

@Controller
public class findCustomersController {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/findcustomerPage")
	public String findcustomer() {
		return "customer/findcustomer";
	}
	
	@RequestMapping(value = "/findcustomer", method=RequestMethod.POST)
	public String findAllCus(ModelMap model) {
		model.addAttribute("customers", customerService.findCustomers());
		System.out.println(customerService.findCustomers());
		return "customer/findcustomer";
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
}
