package cn.itcast.crm.service;

import cn.itcast.common.utils.Page;
import cn.itcast.crm.pojo.Customer;
import cn.itcast.crm.pojo.QueryVo;

public interface CustomerService {
	/*
	 * 根据条件分页查询客户
	 */
	Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	
	/*
	 * 根据id查询客户数据
	 */
	Customer queryCustomerById(Long id);
	
	/*
	 * 根据id编辑客户数据
	 */
	void updateCustomerById(Customer customer);
	
	/*
	 * 根据id删除客户数据
	 */
	void deleteCustomerById(Long id);
	
}
