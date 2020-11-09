package com.mgf.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.mgf.dubbo.bean.Address;
import com.mgf.dubbo.service.UserService;

public class UserServiceImpl implements UserService{

	public List<Address> getUserAddresses(String userId) {
		Address a1 = new Address("001","广东省佛山市南海区碧翠豪城10栋");
		Address a2 = new Address("001","湖南省湘潭县中路铺镇");
		List<Address> listResult = new ArrayList<Address>();
		listResult.add(a1);
		listResult.add(a2);
		return listResult;
	}

}
