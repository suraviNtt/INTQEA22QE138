package project_name.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScenarioName {
	
	private static String username; 
	private static String password;
	
	@BeforeGroups(alwaysRun =  true)
	public void beforeGroup() {
		System.out.println("beforeGroup");
	}
	@BeforeSuite(alwaysRun =  true)
	public void beforeSuit() {
		System.out.println("beforSuit");
	}
	
	@BeforeClass(alwaysRun =  true)
	public void beforeClass() {
		username = "";
		password = "";
		System.out.println("beforeClas");
	}
	
	@BeforeTest(alwaysRun =  true)
	public void beforeTest() {
		username = "";
		password = "";
		System.out.println("beforeTest");
	}
	
	@BeforeMethod(alwaysRun =  true)
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test(groups = "sanity")
	public void testCaseHeading() {
		System.out.println("TestCaseHeading");
	}
	
	@Test(groups = {"regression" , "sanity"})
	public void testCaseHeading1() {
		System.out.println("TestCaseHeading1");
	}
	
	@Test(groups = "sanity")
	@Parameters({"username" , "password"})
	public void testCaseHeading2(String username , String password) {
		System.out.println("TestCaseHeading2");
		System.out.println("Username : "+username + "Password : "+password);
	}
	
	@Test(groups = "regression")
	public void testCaseHeading3() {
		System.out.println("TestCaseHeading3");
	}
	
	@Test (groups = "sanity")
	public void testCaseHeading4() {
		System.out.println("TestCaseHeading4");
	}
	
	@AfterMethod(alwaysRun =  true)
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
}
