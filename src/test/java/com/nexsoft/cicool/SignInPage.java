package com.nexsoft.cicool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	protected WebDriver driver;
	
	private By email = By.xpath("//input[@placeholder='Email']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By btnSignIn = By.xpath("//button[@type='submit']");
	
	public SignInPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public Dashboard  loginValidUser(String username, String user_password) {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(username);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(user_password);
		driver.findElement(btnSignIn).click();
		
		return new Dashboard(driver);
		
		
		
	}
	

}
