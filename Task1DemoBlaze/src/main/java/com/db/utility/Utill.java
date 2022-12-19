package com.db.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class Utill extends TestBase {
	
	public Utill()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repository------------------
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	 private WebElement add_to_cart_btn;

	
	//--------action method---------------------
	
	 public void clickOnAddToCardButton() throws InterruptedException
	 {
		 add_to_cart_btn.click();
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
	 }

	 public void backHome()
	 {
		 driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		
	 }
	 
	 public void scroll(String scroll)
	 {
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,1200)");
		 JavascriptExecutor js = ( JavascriptExecutor)driver;
			js.executeScript(scroll);
	 }
	 
	 public static  void screenshot(String filename) 
	 {
		 try 
		 {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path="C:\\Users\\ARUN\\eclipse-workspace\\Task1DemoBlaze\\screenshot\\";
			File des =new File(path+filename+".png");
			FileHandler.copy(src, des);
		 } 
		 catch (IOException e)
		 {
			 System.out.println("IO Execuotion  - file not found");
			e.printStackTrace();
		}
	 }
		 
	

}
