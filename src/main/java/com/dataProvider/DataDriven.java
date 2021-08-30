package com.dataProvider;

import org.testng.annotations.DataProvider;

public class DataDriven {

	
	@DataProvider(name = "loginData")
	public Object[][] dp() {
		 
		Object [][] o = new Object[1][2];
		o[0][0] ="Admin";
		o[0][1]="admin123";
		return o;

	}
	
}
