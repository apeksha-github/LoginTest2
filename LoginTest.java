package com.login.test;

import org.testng.annotations.Test;

import com.login.page.LoginMercury;

public class LoginTest {
	
	@Test
	public void logintest() throws Exception {
		LoginMercury lm = new LoginMercury();
		lm.launchpage();
		lm.loginpage();
		lm.closepage();
	}

}
