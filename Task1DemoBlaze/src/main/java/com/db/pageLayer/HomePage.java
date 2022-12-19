package com.db.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()     
	 {
	   PageFactory.initElements(driver, this);
	 }
	
	//------------obj repository----------
	 
	@FindBy(xpath="//a[@id='login2']")                		 
	 private WebElement login_lnk;
	
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phone_lnk;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsung_galaxy_s6;
	
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	private WebElement laptop_lnk;
	
	@FindBy(xpath="//a[contains(text(),'Dell i7 8gb')]")
	private WebElement dellLaptop;
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	private WebElement monitor_lnk;
	
	@FindBy(xpath="//a[contains(text(),'ASUS Full HD')]")
	private WebElement azurMonitor;

	//------------action method-----------
	 
	
	public void clickOnLoginLink() 
	{
		login_lnk.click();
	}
	
	 public void clickOnPhonesLinks()
	 {
		 phone_lnk.click();
	 }
	 
	 public void clickOnSamsungGalaxyS6()
	 {
		 samsung_galaxy_s6.click();
	 }
	 
	 public void clickOnLaptopLink()
	 {
		 laptop_lnk.click();
	 }
	 
	 public void clickOnDellLaptop()
	 {
		 dellLaptop.click();
	 }
	 
	 public void clickOnMonitorLink()
	 {
		 monitor_lnk.click();
	 }
	 
	 public void clickOnAzurMoitor()
	 {
		 azurMonitor.click(); 
	 }
	 
	 
	 
}
