package com.db.pageLayer;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.db.testBase.TestBase;

public class CartPage extends TestBase {
	    
		public static int d;
	    public CartPage()
		{
			PageFactory.initElements(driver, this);
		}
	
      //------------obj repository-----------------
		@FindBy(xpath="//a[contains(text(),'Cart')]")
		private WebElement cart_lnk;
		
		
		@FindBy(xpath="//table/tbody/tr[3]/td[3]")
		private WebElement monitor;
		
		@FindBy(xpath="//table/tbody/tr[2]/td[3]")
		private WebElement laptop;
		
		@FindBy(xpath="//table/tbody/tr[1]/td[3]")
		private WebElement mobile;
		
		@FindBy(xpath="//div[contains(@class,'panel-heading')]")
		private WebElement Total;
		
		@FindBy(xpath="//button[text()='Place Order']")
		private WebElement plcae_order_btn;
		
		@FindBy(xpath="//input[@id='name']")
		private WebElement name_txt;
		

		@FindBy(xpath="//input[@id='country']")
		private WebElement country_txt;
		

		@FindBy(xpath="//input[@id='city']")
		private WebElement city_txt;
		

		@FindBy(xpath="//input[@id='card']")
		private WebElement creditcard_txt;
		

		@FindBy(xpath="//input[@id='month']")
		private WebElement month_txt;
		

		@FindBy(xpath="//input[@id='year']")
		private WebElement year_txt;
		
		@FindBy(xpath="//button[text()='Purchase']")
		private WebElement purchase;
		
		@FindBy(xpath="//p[@class='lead text-muted ']")
		private WebElement finalId;
		
		@FindBy(xpath="//button[text()='OK']")
		private WebElement ok_button;
		
	   //---------action method---------------------
		  public void clickOnCart()
		  {
			  cart_lnk.click(); 
		  }
	  
	 
	        public void getProductPrice()
	        {
			  String x = monitor.getText();
			  int a = Integer.parseInt(x) ;
			  
			  String y=laptop.getText();
			  int b = Integer.parseInt(y) ;
			 
			  String z=mobile.getText();
			  int c = Integer.parseInt(z) ;
			  
			  int[] arr = {a,b,c};
			  Arrays.sort(arr);
			  
			  for(int values:arr)
			  {
				System.out.println(values+","); 
				
			  }
			  
			   d=a+b+c;
			   System.out.println("d="+d);
	        }
	   
	  public void checksum()
	   {
		   
			   String p = Total.getText();
			   int total =Integer.parseInt(p);
			   System.out.println("total="+total);
			   System.out.println("");
			   if(d==total)
			   {
				  // System.out.println(d+"=="+total);
			   	  System.out.println("checkpoint  pass");
			   	  System.out.println("");
			   }
			   
			   else
			   {
				    // System.out.println(d+"!="+total);
			   		System.out.println("checkpoint not pass");
			   		System.out.println("");
			   }
	   }
	  
	  public void clickOnPlaceOrder()
	  {
		  plcae_order_btn.click();
	  }
	  
	  public void enterName(String name)
	  {
		  name_txt.sendKeys(name);
	  }
	  
	  public void enterCountryName(String country)
	   {
		  country_txt.sendKeys(country);  
	   }
	  public void enterCityName(String city)
	   {
		  city_txt.sendKeys(city);
	   }
	  public void enterCardnumber(String card )
	   {
		  
		creditcard_txt.sendKeys(card);
	   }
	  public void enterMonth(String month)
	   {
		  month_txt.sendKeys(month);
	   }
	  public void enterYear(String  year)
	   {
		  year_txt.sendKeys(year);
	   }
	  
	  public void clickOnPurchase()
	  {
		  purchase.click();
	  }
	  
	  public void getFinalDetail()
	  {
		 String id = finalId.getText();
		  System.out.println(id);
	  }
	  
	  public void clickOkButton()
	  {
		  ok_button.click();
	  }
	  
	  
	  
   
}

