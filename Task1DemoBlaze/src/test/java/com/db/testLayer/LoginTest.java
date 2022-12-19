package com.db.testLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.pageLayer.CartPage;
import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.testBase.TestBase;
import com.db.utility.Utill;

public class LoginTest extends TestBase {
	
	
	@Test()
	public void loginDemoBlaze() throws InterruptedException
		{	
			HomePage home = new HomePage();
			LoginPage log = new LoginPage();
			
			
			home.clickOnLoginLink();
			
			log.enterUsername("sctqaautomation@grr.la");
			log.enterPassword("Spring@123");
			Assert.fail();
			//log.clickOnLoginButton();
			
		}
	
	@Test
	public void buyDemoBlaze() throws InterruptedException
		{	
			HomePage home = new HomePage();
			LoginPage log = new LoginPage();
			Utill ut = new Utill();
			CartPage cd= new CartPage();
			
			home.clickOnLoginLink();
			Thread.sleep(2000);
			log.enterUsername("AshishPatil@gmail.com");
			log.enterPassword("Test@1234");
			log.clickOnLoginButton();
			
			Thread.sleep(4000);
			home.clickOnPhonesLinks();
			Thread.sleep(4000);
			home.clickOnSamsungGalaxyS6();	//click Samasung
			ut.clickOnAddToCardButton();
			ut.backHome();
			
			home.clickOnLaptopLink();
			ut.scroll("window.scrollBy(0,1000)");
			home.clickOnDellLaptop();		//click Dell
			ut.clickOnAddToCardButton();
			ut.backHome();
			
			home.clickOnMonitorLink();
			home.clickOnAzurMoitor();		//click AzurMonitor
			ut.clickOnAddToCardButton();
			ut.backHome();
			
			cd.clickOnCart();
			cd.getProductPrice();        //click card 
			cd.checksum();
			cd.clickOnPlaceOrder();		//cllick place order
			
			cd.enterName("Ap Patil");
			cd.enterCountryName("us");
			cd.enterCityName("dhaka");     
			cd.enterCardnumber("324544871556");  //all detail
			cd.enterMonth("march");
			cd.enterYear("2222");
			cd.clickOnPurchase();				//clickpurcha
			cd.getFinalDetail();
			cd.clickOkButton();
			
	}			

}
