package com.learn2w.ssa2.hello_world_spring_security.config;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.core.userdetails.UserDetailsService;

public class ProjectConfigTest {
	@Test
	public void userDetailsService() {
		ProjectConfig p = new ProjectConfig();
		UserDetailsService expected = null;
		UserDetailsService actual = p.userDetailsService();

		assertEquals(expected, actual);
	}
}
