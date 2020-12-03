package com.mgf.dubbo.provider;

import com.mgf.dubbo.service.IUserService;

public class UserServiceImpl implements IUserService {
  
	
	public String getNameById(String uid) {
		System.out.println("receive request data:"+uid);
		return "magaofeng";
	}

}
