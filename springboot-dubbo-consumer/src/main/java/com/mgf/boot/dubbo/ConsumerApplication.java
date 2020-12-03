package com.mgf.boot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mgf.dubbo.service.IUserService;

@SpringBootApplication
public class ConsumerApplication {
	
	@org.apache.dubbo.config.annotation.Reference (url="dubbo://192.168.0.103:20880/com.mgf.dubbo.service.IUserService" )
	private IUserService userService;
	

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		
		
	}
	
	
	@Bean
	public String test() {
		System.out.print(userService.getNameById("tangpei"));
		
		return "";
	}

}
