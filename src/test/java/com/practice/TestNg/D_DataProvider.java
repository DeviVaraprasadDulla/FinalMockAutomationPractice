package com.practice.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D_DataProvider {
	
	
	@DataProvider(name="users_Details")
	public Object dataProviderMethod() {
		
		Object data[][] = new Object[3][2];
		
		data[0][0]="Prasad";
		data[0][1]="Prasad@51";
		
		data[1][0]="Jhon";
		data[1][1]="Jhon@2002";
		
		data[2][0] ="Steve";
		data[2][1] ="Steve@02";
		
		return data;
	}
	
	
	@Test(dataProvider= "users_Details")
	public void userLoging(String userName,String password) {
		System.out.println("====== User Details ======");
		System.out.println();
		System.out.println("User Name : "+userName);
		System.out.println("Password : "+password);
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		System.out.println();
	}

}
