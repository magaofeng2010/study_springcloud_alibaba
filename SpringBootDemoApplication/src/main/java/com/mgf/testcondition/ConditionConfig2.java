package com.mgf.testcondition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 当有属性 mgf.bean.enable 时才加载
 * @author flp
 *
 */
@Configuration
public class ConditionConfig2 {

	@Bean
	@ConditionalOnBean(value=Head.class)
	public Body initBody() {
		System.out.println("满足ConditionConfig2");
		Body body = new Body();
		body.setName("唐佩");
		return body;
	}
	
	@Bean
	@ConditionalOnResource(resources= {"classpath:a.properties"})
	public Body2 initBody2() {
		Body2 body = new Body2();
		body.setName("唐佩666");
		return body;
	}
}
