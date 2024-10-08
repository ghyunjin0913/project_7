package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.service.CustomerService;

@Controller
public class findCustomerByName {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/findcustomerByNamePage")
	public String findcustomer() {
		return "customer/findcustomerByname";
	}
	
	@RequestMapping(value = "/findcustomerByname", method=RequestMethod.POST)
	public String findOneCus(@RequestParam(value="name") String name, ModelMap model) {
		model.addAttribute("customer", customerService.findCustomerByName(name));
		System.out.println(customerService.findCustomerByName(name).getName());
		
		return "customer/findcustomerByname";
	}
	

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
