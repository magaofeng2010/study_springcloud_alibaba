package com.mgf.dubbo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"classpath*:user_dubbo.xml"}) 
public class UserAppApplication {

	public static void main(String[] args) throws IOException {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"user_dubbo.xml"});
        //context.start();
		SpringApplication.run(UserAppApplication.class, args);
        //System.in.read(); // 按任意键退出
	}

}
