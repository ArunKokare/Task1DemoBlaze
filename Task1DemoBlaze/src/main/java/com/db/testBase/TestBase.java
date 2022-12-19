package com.db.testBase;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.db.pageLayer.CartPage;
import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.utility.Utill;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public HomePage home ;
	public LoginPage log ; 
	public Utill ut ;
	public CartPage cd;
	
	@BeforeClass
	public void strat()
	{
		logger=Logger.getLogger("DemoBlaze Automation framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework Execution Started");
		System.out.println();
	}
	
	@AfterClass
	public void end()
	{
		logger.info("Framework Execution Started");
	}
	
	
	@Parameters("browser")
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		String br="chrome";
		
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser");
		}
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("url lunches ,maximize,and provided waits");
		
	//------------Object creation------------------
		 home = new HomePage();
		 log = new LoginPage();
		 ut = new Utill();
		 cd= new CartPage();
		 
  //------------login step-----------------------------
		    home.clickOnLoginLink();
			log.enterUsername("AshishPatil@gmail.com");
			log.enterPassword("Test@1234");
			log.clickOnLoginButton();
			Thread.sleep(4000);
		

	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();

	}
	

}
