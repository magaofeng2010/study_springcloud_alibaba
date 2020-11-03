package com.mgf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mgf.testImportSelector.EnableAutoImportMgf;
import com.mgf.testcondition.ConditionConfig2;

@SpringBootApplication
@EnableAutoImportMgf
public class SpringBootDemoApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
