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

public class ITCStore_LoginLogout {
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
