package com.mgf.dubbo.service;

import java.util.List;

import com.mgf.dubbo.bean.Address;

public interface UserService {
   
	/**
	 * �����û�id��ȡ�û���ַ
	 * @param userId
	 * @return
	 */
	public List<Address> getUserAddresses(String userId);
	
	
}
