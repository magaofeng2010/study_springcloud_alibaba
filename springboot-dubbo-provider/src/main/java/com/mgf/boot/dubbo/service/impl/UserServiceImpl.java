package com.mgf.boot.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.mgf.dubbo.service.IUserService;

@org.apache.dubbo.config.annotation.Service
public class UserServiceImpl implements IUserService {
  
	
	public String getNameById(String uid) {
		System.out.println(" spring boot receive request data:"+uid);
		return "magaofeng   "+ uid;
	}

}
