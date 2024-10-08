package springmvc.service;

import java.util.List;

import springmvc.dto.Purchase;

public interface PurchaseService {
	List<Purchase> findPurchaseList(String name);
}
