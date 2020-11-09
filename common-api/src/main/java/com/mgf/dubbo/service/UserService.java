package com.mgf.dubbo.service;

import java.util.List;

import com.mgf.dubbo.bean.Address;

public interface UserService {
   
	/**
	 * 根据用户id获取用户地址
	 * @param userId
	 * @return
	 */
	public List<Address> getUserAddresses(String userId);
	
	
}
