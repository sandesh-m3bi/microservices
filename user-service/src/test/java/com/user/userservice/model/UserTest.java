package com.user.userservice.model;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UserTest {
	@Test
	public void callingUserConstructorWithoutParametersCreatesExpectedObject() {
		User user = new User();
		assertNull(user.getUsername());
		assertNull(user.getPassword());
		assertNull(user.getRole());
	}
}
