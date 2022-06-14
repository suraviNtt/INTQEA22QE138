package project_name.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScenarioName {
	
	private static String username; 
	private static String password;
	
	
	@BeforeTest
	public void beforeTest() {
		username = "";
		password = "";
		System.out.println("beforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test
	public void testCaseHeading() {
		System.out.println("TestCaseHeading");
	}
	
	@Test
	public void testCaseHeading1() {
		System.out.println("TestCaseHeading1");
	}
	
	@Test
	public void testCaseHeading2() {
		System.out.println("TestCaseHeading2");
	}
	
	@Test
	public void testCaseHeading3() {
		System.out.println("TestCaseHeading3");
	}
	
	@Test
	public void testCaseHeading4() {
		System.out.println("TestCaseHeading4");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
}
