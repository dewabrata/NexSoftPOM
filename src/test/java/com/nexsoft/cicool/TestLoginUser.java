package com.nexsoft.cicool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		SignInPage formSignIn = home.clickSignIn();
		Dashboard dashboard =formSignIn.loginValidUser("dewabrata@gmail.com", "123456");
		
		dashboard.clickCrudBuilder();
		
	}

}
