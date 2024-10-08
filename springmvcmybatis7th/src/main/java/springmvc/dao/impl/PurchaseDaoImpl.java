package springmvc.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc.dao.PurchaseDao;
import springmvc.dto.Purchase;

@Repository
public class PurchaseDaoImpl implements PurchaseDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Purchase> findPurchaseList(String name) {
		List<Purchase> purchase = sqlSessionTemplate.selectList(
				"purchase.findPurchaseList", name);
		return purchase;
	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	
}
