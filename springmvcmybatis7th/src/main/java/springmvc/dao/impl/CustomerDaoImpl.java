package springmvc.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc.dao.CustomerDao;
import springmvc.dto.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	@Override
	public List<Customer> findCustomers() {
		List<Customer> customerList =
				sqlSessionTemplate.selectList(
						"customer.findCustomers");
		return customerList;
	}

	@Override
	public Customer findCustomerByName(String name) {
		Customer customer = sqlSessionTemplate.selectOne(
				"customer.findCustomerByName", name);
		return customer;
	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
