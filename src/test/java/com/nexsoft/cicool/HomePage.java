package com.nexsoft.cicool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	protected WebDriver driver;
	
	private By signIn = By.xpath("//a[@class='page-scroll']");
	private By languageSetting = By.xpath("//a[@class='dropdown-toggle']");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public SignInPage clickSignIn() {
		driver.findElement(signIn).click();
		
		return new SignInPage(driver);
	}

}
