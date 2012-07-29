package com.callentry.test;

import com.callentry.model.User;
import com.callentry.service.UserService;
import com.callentry.util.GUIDGenerator;

public class GUIDTest {

	public static void main(String[] args) {
		System.out.println(GUIDGenerator.generateNewId());
		User user = new User();
		UserService.saveOrUpdate(user);
	}

}
