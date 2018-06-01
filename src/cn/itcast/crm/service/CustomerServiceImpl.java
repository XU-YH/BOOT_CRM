package cn.itcast.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.common.utils.Page;
import cn.itcast.crm.mapper.CustomerMapper;
import cn.itcast.crm.pojo.Customer;
import cn.itcast.crm.pojo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {
		// 设置当前页的第一条数据是第几条数据
		queryVo.setStart((queryVo.getPage() - 1) * queryVo.getRows());

		// 获取当前页数据结果集
		List<Customer> list = this.customerMapper.queryCustomerByQueryVo(queryVo);

		// 获取当前页数据总条数
		int total = this.customerMapper.queryCountByQueryVo(queryVo);

		// 封装返回page对象
		Page<Customer> page = new Page<>(total, queryVo.getPage(), queryVo.getRows(), list);

		return page;
	}

	@Override
	public Customer queryCustomerById(Long id) {
		Customer customer = this.customerMapper.queryCustomerById(id);		
		return customer;
	}

	@Override
	public void updateCustomerById(Customer customer) {
		this.customerMapper.updateCustomerById(customer);		
	}

	@Override
	public void deleteCustomerById(Long id) {
		this.customerMapper.deleteCustomerById(id);
	}

}
