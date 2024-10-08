package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.service.PurchaseService;

@Controller
public class findPurchaseList {
	@Autowired
	PurchaseService purchaseService;

	@RequestMapping(value = "/findpurchaseListPage")
	public String findpurchase() {
		return "purchase/findpurchaseList";
	}
	
	@RequestMapping(value = "/findPurchaseList", method=RequestMethod.POST)
	public String serchPurchaseList(@RequestParam(value="name") String name, ModelMap model) {
		model.addAttribute("purchase", purchaseService.findPurchaseList(name));
		System.out.println(purchaseService.findPurchaseList(name));
		
		return "purchase/findpurchaseList";
	}
	
	public PurchaseService getPurchaseService() {
		return purchaseService;
	}

	public void setPurchaseService(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}
	
	
}
