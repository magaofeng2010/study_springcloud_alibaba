package com.mgf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.mgf.testcondition.Body;
import com.mgf.testcondition.Body2;
import com.mgf.testcondition.Head;

@SpringBootTest
class SpringBootDemoApplicationTests {
    //@Autowired
	//Head head;
    
    @Autowired
    private ApplicationContext applicationContext;
    
	void contextLoads() {
		
	}
	
	@org.junit.jupiter.api.Test
	public void Test() {
		System.out.println("head:"+applicationContext.getBean(Head.class));
		System.out.println("body:"+applicationContext.getBean(Body.class));
		System.out.println("body2:"+applicationContext.getBean(Body2.class));
	}

}
