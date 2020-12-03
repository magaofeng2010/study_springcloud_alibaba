package com.mgf.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgf.dubbo.service.IUserService;

public class OrderServiceMain {
public static void main(String[] args) throws IOException {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:order-provider.xml");
           
		IUserService userService = (IUserService)context.getBean("userService");
		
		System.out.println(userService.getNameById("mgf"));
		
		
		
		
	}
}
