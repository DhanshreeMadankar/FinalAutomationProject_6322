package ITCStore_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.io.FileHandler;

public class ITCStore_Login {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);

		// Maximize Browser
		driver.manage().window().maximize();

	}

	@Test (priority=1)
	public void login() throws Exception
	{
		// URL
		driver.get("https://itcstore.in/");
		Thread.sleep(2000);

		// Window
		driver.findElement(By.xpath("//*[@id=\"zip-skip\"]")).click();
		Thread.sleep(2000);

		// My Account
		driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]")).click();
		Thread.sleep(2000);

		// Log In
		driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div[2]/div/div/div[1]/div/div")).click();
		Thread.sleep(2000);

		// Email ID
		driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys("saurabhd3552@gmail.com");
		Thread.sleep(2000);

		// Password
     	driver.findElement(By.xpath("//*[@id=\"customer_password\"]")).sendKeys("Saurabh@3552");
		Thread.sleep(2000);

		// Login
		driver.findElement(By.xpath("//*[@id=\"login_submit_btn\"]")).click();
		Thread.sleep(2000);
	}
	

	@Test (priority=2)
	public void modules1() throws Exception
	{
	    
	  //(MODULE-1)
		  
		  // Window
		  driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("440030");
		  Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//*[@id=\"zip-check\"]")).click();
		  Thread.sleep(2000);
	}
	
	@Test (priority=3)
	public void modules2() throws Exception
	{
		  
	  //(MODULE-2)
		  // Home Page
		 driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[1]/a")).click();	
		 Thread.sleep(2000);
		   
	      //Product Add to cart
		  driver.findElement(By.xpath("//*[@id=\"grid-product-form--6609591042102\"]/button")).click();
		  Thread.sleep(2000);
		  
		  //Click on product
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-1622474552a353ab51\"]/div/section/div[1]/div/div/div[1]")).click();
		  Thread.sleep(2000);
		  	  
		  //Click on image
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[6]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[7]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[8]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[9]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[10]/a/img")).click();
		  Thread.sleep(2000);

		  //Add one more item
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart-form\"]/div[1]/div[1]/div[1]/div/div/a[2]")).click();
		  Thread.sleep(2000);
		  
		  //Check Add to Cart
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-header-supermarket\"]/header/div/div/div[2]/div/div/div/div[3]/div/div[2]")).click();
		  Thread.sleep(2000);
		  
	      //Close Add to cart
		  driver.findElement(By.xpath("//*[@id=\"dropdown-cart\"]/div[1]/a")).click();
		  Thread.sleep(2000);
	}
	
	@Test (priority=4)
	public void modules3() throws Exception
	{
		  
     //(MODULE-3)
		  //(FOODS)
		  driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[2]/a")).click();
		  Thread.sleep(2000);
		  
		  //Sort By
		  driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-top-sorting\"]/label")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-top-sorting\"]/ul/li[4]/a")).click();
		  Thread.sleep(2000);
		  
		  //Categories
		  driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-option-block-categories\"]/div/div[1]/ul/li[6]/a/span[1]")).click();
		  Thread.sleep(2000);
		  
		  //Brands
		  driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-option-block-brands\"]/ul/li[2]/a/span[1]")).click();
		  Thread.sleep(2000);
		  
		  //Price
		  driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-option-block-price\"]/ul/li[2]/a/span[1]")).click();
		  Thread.sleep(2000);
		  
		  //Discount
		  driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-option-block-discount\"]/ul/li[1]/a/span[1]")).click();
		  Thread.sleep(2000);
		  
		  //Product Add to cart
		  driver.findElement(By.xpath("//*[@id=\"grid-product-form-6609600151606\"]/button")).click();
		  Thread.sleep(2000);
		  
		  //Click on image
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[5]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[6]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[7]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[8]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[9]/a/img")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"ProductSection-product-template-default\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[10]/a/img")).click();
		  Thread.sleep(2000);
		  
		  //Check Add to Cart
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-header-supermarket\"]/header/div/div/div[2]/div/div/div/div[3]/div/div[2]")).click();
		  Thread.sleep(2000);
		  
		  //Close Add to cart
		  driver.findElement(By.xpath("//*[@id=\"dropdown-cart\"]/div[1]/a")).click();
		  Thread.sleep(2000);
	}
	
	@Test (priority=5)
	public void modules4() throws Exception
	{
		  
	  //(MODULE-4)
		  //(Shop All)	
		  driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[7]/a")).click();
		  Thread.sleep(2000);
			
		  //Cookies Accept
		  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/a[2]")).click();
		  Thread.sleep(2000);
				  		  
		  //Privacy and Policy
		  driver.findElement(By.xpath("/html/body/div[2]/div[1]/footer/div[4]/div/div/div[1]/div/div[1]/ul/li[1]")).click();
		  Thread.sleep(2000);
		  
		  //Terms of use
		  driver.findElement(By.xpath("/html/body/div[2]/div[1]/footer/div[4]/div/div/div[1]/div/div[1]/ul/li[2]")).click();
		  Thread.sleep(2000);
		  
		  //About Us
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-footer-4\"]/footer/div[4]/div/div/div[1]/div/div[1]/ul/li[3]/a/span")).click();
		  Thread.sleep(2000);
		  
		  //Return Refund and cancellation
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-footer-4\"]/footer/div[4]/div/div/div[1]/div/div[2]/ul/li[1]/a/span")).click();
		  Thread.sleep(2000);
		  
		  //Billing Terms and condition
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-footer-4\"]/footer/div[4]/div/div/div[1]/div/div[2]/ul/li[2]/a/span")).click();
		  Thread.sleep(2000);
		  
		  //Blogs
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-footer-4\"]/footer/div[4]/div/div/div[1]/div/div[2]/ul/li[3]/a/span")).click();
		  Thread.sleep(2000);
		  
		  //Recipes
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-sidebar-blog\"]/div[2]/div[2]/div/ul/li[1]/a")).click();
		  Thread.sleep(2000);
		  
		  //Health
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-sidebar-blog\"]/div[2]/div[2]/div/ul/li[2]/a")).click();
		  Thread.sleep(2000);
		  
		  //Products
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-sidebar-blog\"]/div[2]/div[2]/div/ul/li[3]/a")).click();
		  Thread.sleep(2000);
		  
		  //Cooking
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-sidebar-blog\"]/div[2]/div[2]/div/ul/li[4]/a")).click();
		  Thread.sleep(2000);
		  
		  //Kids
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-sidebar-blog\"]/div[2]/div[2]/div/ul/li[5]/a")).click();
		  Thread.sleep(2000);
		  
		  //Seasonal
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-sidebar-blog\"]/div[2]/div[2]/div/ul/li[6]/a")).click();
		  Thread.sleep(2000);
	}
	
	@Test (priority=6)
	public void modules5() throws Exception
	{
     //(MODULE-5)
	      //Search Box
	      driver.findElement(By.xpath("//*[@id=\"st-searchbox\"]/div/div[1]/div/div/div/input[4]")).sendKeys("Engage Lamante Perfumes");
		  Thread.sleep(2000);
		  
		  //Search Button
		  driver.findElement(By.xpath("//*[@id=\"st-searchbox\"]/div/div[1]/div/div/div/button")).sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  
		  //Product add to cart
		  driver.findElement(By.xpath("//*[@id=\"grid-product-form-6609599070262\"]/button")).click();
		  Thread.sleep(2000);
		  
		  //Add to Cart
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-header-supermarket\"]/header/div/div/div[2]/div/div/div/div[3]/div/div[2]")).click();
		  Thread.sleep(2000);
		  
		  //Proceed To Checkout
   	      driver.findElement(By.xpath("//*[@id=\"dropdown-cart\"]/div[3]/div/div[4]")).click();
		  Thread.sleep(2000);
		  
		  //Add Delivery Date
		  driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		  Thread.sleep(2000);
		  
		  //Date has a frequently change as per the order so its some times shows the error
		  //Date
		  driver.findElement(By.xpath("//*[@id=\"your-shopping-cart\"]/div[18]/div[1]/table/tbody/tr[5]/td[3]")).click();
		  Thread.sleep(2000);
		  
		  //Again Proceed To Checkout
		  driver.findElement(By.name("checkout")).click();
		  Thread.sleep(2000);
		  

	}
	
	@Test (priority=7)
	public void Screenshotpersonalcare() throws Exception	
	 {
		//Personal Care
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[3]")).click();
		Thread.sleep(2000);
		
		//How to Take Screenshort
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File(".\\Personalcare.png"));
	    Thread.sleep(2000);
	    
     }
	
	@Test (priority=8)
	public void ScreenshotCleaningandHousehold() throws Exception	
	 {
		//Cleaning And Household
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[4]")).click();
		Thread.sleep(2000);
		
		//How to Take Screenshort
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File(".\\CleaningAndHousehold.png"));
	    Thread.sleep(2000);
	    
     }
	
	@Test (priority=9)
	public void ScreenshotStationary() throws Exception	
	 {
		//Stationary
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[5]")).click();
		Thread.sleep(2000);
		
		//How to Take Screenshort
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File(".\\Stationary.png"));
	    Thread.sleep(2000);
	    
     }
	
	@Test (priority=10)
	public void ScreenshotNewLaunch() throws Exception	
	 {
		//New Launch
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[6]")).click();
		Thread.sleep(2000);
		
		//How to Take Screenshort
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File(".\\NewLaunch.png"));
	    Thread.sleep(2000);
	    
     }
	
	@Test (priority=11)
	public void ScreenshotMagicBox() throws Exception	
	 {
		//Magic Box
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[8]")).click();
		Thread.sleep(2000);
		
		//How to Take Screenshort
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File(".\\MagicBox.png"));
	    Thread.sleep(2000);
	    
     }
	
	@Test (priority=12)
	public void logout() throws Exception
	{
		  

		// Logout Account
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header-supermarket\"]/header/div/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]")).click();
		Thread.sleep(2000);

		// Logout
		driver.findElement(By.xpath("//*[@id=\"customer_logout_link\"]")).click();
		Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest()
	{
		driver.close();
	}

}
