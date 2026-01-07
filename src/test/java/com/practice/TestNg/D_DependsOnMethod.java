package com.practice.TestNg;

import org.testng.annotations.Test;

public class D_DependsOnMethod {
	

	@Test
	public void registration() {
		System.out.println("1.User Registration Sucessfull.");
	}
	@Test(dependsOnMethods="registration")
	public void loginUser() {
		System.out.println("2.User Login Sucessfull.");
	}
	@Test(dependsOnMethods="loginUser")
	public void searchProducts() {
		System.out.println("3.Seraching Products.");
		System.out.println(1/0);//Exception
	}
	@Test(dependsOnMethods="searchProducts")
	public void addToCart() {
		System.out.println("4.Product Added to cart");
	}
	@Test(dependsOnMethods="addToCart")
	public void orderTheProduct() {
		System.out.println("5.Order placed.");
	}

}
