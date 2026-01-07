package com.practice.TestNg;

import org.testng.annotations.Test;

public class D_DependsOnMethod {
	

	@Test(priority=1)
	public void registration() {
		System.out.println("1.User Registration Sucessfull.");
	}
	@Test(priority=2)
	public void loginUser() {
		System.out.println("2.User Login Sucessfull.");
	}
	@Test(priority=3)
	public void searchProducts() {
		System.out.println("3.Seraching Products.");
		System.out.println(1/0);//Exception
	}
	@Test(priority=4)
	public void addToCart() {
		System.out.println("4.Product Added to cart");
	}
	@Test(priority=5)
	public void orderTheProduct() {
		System.out.println("5.Order placed.");
	}

}
