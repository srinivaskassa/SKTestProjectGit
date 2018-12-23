package com.practice.testPackage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class TestNGPractice122320182 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method executed BEFORE each Test Method execution");
	}

	@Test
	public void testMethod2() {
		System.out.println("2nd Test Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method executed AFTER each Test Method execution");
	}
}
