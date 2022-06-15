package com.nexsoft.cicool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLoginUser {
	
protected WebDriver driver;
	
	@BeforeClass
	public void init() {
		System.setProperty("url", "http://localhost/cicool");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void testLogin() {
		
		HomePage home = new HomePage(driver);
		SignInPage formSignIn = home.clickSignIn();
		formSignIn.loginValidUser("dewabrata@gmail.com", "123456");
		
	}

}
