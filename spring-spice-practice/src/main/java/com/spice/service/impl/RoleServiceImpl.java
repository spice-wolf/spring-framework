package com.spice.service.impl;

import com.spice.service.RoleService;
import com.spice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author spice
 * @date 2021/03/17 20:24
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private UserService userService;

	public RoleServiceImpl() {
		System.out.println("Constructor from role service!");
	}

	@Override
	public void getService() {
		System.out.println("There is a user service : " + userService);
	}
}
