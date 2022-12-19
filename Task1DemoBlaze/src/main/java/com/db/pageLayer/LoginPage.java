package com.db.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------obj repository-----------------------
	@FindBy(xpath="//input[@id='loginusername']")
	private  WebElement username_txt;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	private  WebElement password_txt;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private  WebElement login_btn;
	
	//-------------action method----------------------
	public void enterUsername(String username)
	{
		username_txt.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
	
	

}
