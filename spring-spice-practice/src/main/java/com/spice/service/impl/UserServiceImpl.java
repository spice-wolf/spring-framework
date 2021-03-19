package com.spice.service.impl;

import com.spice.service.RoleService;
import com.spice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author spice
 * @date 2021/03/17 20:22
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RoleService roleService;

	public UserServiceImpl() {
		System.out.println("Constructor from user service!");
	}

	@Override
	public void printUser() {
		System.out.println("Print a user!");
	}

	@Override
	public void getService() {
		System.out.println("There is a role service : " + roleService);
	}
}
