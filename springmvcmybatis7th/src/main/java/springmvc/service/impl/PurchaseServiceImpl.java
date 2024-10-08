package springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.PurchaseDao;
import springmvc.dto.Purchase;
import springmvc.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	@Resource
	private PurchaseDao purchaseDao;
	
	@Override
	public List<Purchase> findPurchaseList(String name) {
		List<Purchase> purchase =
				purchaseDao.findPurchaseList(name);
		return purchase;
	}

	public PurchaseDao getPurchaseDao() {
		return purchaseDao;
	}

	public void setPurchaseDao(PurchaseDao purchaseDao) {
		this.purchaseDao = purchaseDao;
	}

}
