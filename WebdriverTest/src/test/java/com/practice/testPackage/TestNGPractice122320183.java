package com.practice.testPackage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class TestNGPractice122320183 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method executed BEFORE each Test Method execution");
	}

	@Test
	public void testMethod3() {
		System.out.println("3rd Test Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method executed AFTER each Test Method execution");
	}
}
