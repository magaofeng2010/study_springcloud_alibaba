package com.mgf.testcondition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 当有属性 mgf.bean.enable 时才加载
 * @author flp
 *
 */
@Configuration
@ConditionalOnProperty(value="mgf.bean.enable",havingValue="true")
public class ConditionConfig {

	@Bean
	public Head initHead() {
		Head head = new Head();
		head.setName("马高峰");
		return head;
	}
}
