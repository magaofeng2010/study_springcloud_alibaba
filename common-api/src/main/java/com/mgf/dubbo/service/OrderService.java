package com.mgf.dubbo.service;

import com.mgf.dubbo.bean.Order;

public interface OrderService {

	/**
	 * 创建一个订单
	 * @return
	 */
	public Order createOrder();
}
