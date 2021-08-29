package com.dataProvider;

import org.testng.annotations.DataProvider;

public class DataDriven {

	
	@DataProvider(name = "loginData")
	public Object[][] dp() {
		 
		Object [][] o = new Object[2][2];
		o[0][0] ="user1";
		o[0][1]="pass1";
		o[1][0] ="user2";
		o[1][1]="pass2";
		return o;

	}
	
}
