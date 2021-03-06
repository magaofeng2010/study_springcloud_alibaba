package com.mgf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	public RedisTemplate<String,String> redisTemplate;

	@GetMapping("/hello")
	public String sayHello() {
		return "<h1>11111111111111111111111111111111111111111111111</h1>";
	}
	
	@GetMapping("/save")
	public String save() {
		redisTemplate.opsForValue().set("name", "mayujing");
		return "</image><image src=\"http://localhost:8888/demo/2.jpg\"><image src=\"http://localhost:8888/demo/3.jpg\\\"></image><image src=\"http://localhost:8888/demo/1.jpg\">";
	}
	
}
