package com.mgf.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceMain {
	public static void main(String[] args) throws IOException {
		
		//第一种方式
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:user-provider.xml");

		context.start();

		System.in.read();// 阻塞主线程
		
		
		
	}
}
