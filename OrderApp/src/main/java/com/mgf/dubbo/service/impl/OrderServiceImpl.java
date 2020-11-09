package com.mgf.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mgf.dubbo.bean.Address;
import com.mgf.dubbo.bean.Order;
import com.mgf.dubbo.service.OrderService;
import com.mgf.dubbo.service.UserService;

public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private UserService userService;

	@Override
	public Order createOrder() {
		
		Order order = new Order("001","手机","001");
		
		List<Address> listAddress = userService.getUserAddresses(order.getUserId());
		
		order.setAddress(listAddress.get(0).getAddress());
		
		return order;
	}

}
