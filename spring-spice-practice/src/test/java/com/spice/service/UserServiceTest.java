package com.spice.service;

import com.spice.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author spice
 * @date 2021/03/18 22:09
 */
public class UserServiceTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean("userServiceImpl", UserService.class);
		userService.printUser();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean("userServiceImpl", UserService.class);
		userService.printUser();
	}
}
