package com.mgf.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgf.dubbo.bean.Order;
import com.mgf.dubbo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
    OrderService orderServiceDubbo;
	
	@GetMapping("/createOrder")
	@ResponseBody
	public Order createOrder() {
		return orderServiceDubbo.createOrder();
	}
}
