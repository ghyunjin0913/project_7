package springmvc.dao;

import java.util.List;

import springmvc.dto.Purchase;

public interface PurchaseDao {
	List<Purchase> findPurchaseList(String name);
}
