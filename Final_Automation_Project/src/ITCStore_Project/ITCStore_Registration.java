package ITCStore_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ITCStore_Registration {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);

		// Maximize Browser
		driver.manage().window().maximize();
	}

	@Test
	public void registartion() throws Exception 
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

		// Sign In
		driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div[2]/div/div/div[1]/header/div")).click();
		Thread.sleep(2000);

		// First Name
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Dhanshree Deotale");
		Thread.sleep(2000);

		// Last Name
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Deotale");
		Thread.sleep(2000);

		// Mobile No.
		driver.findElement(By.xpath("//*[@id=\"mobile_no\"]")).sendKeys("7558408848");
		Thread.sleep(2000);

		// Email ID
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("saurabhd3552@gmail.com");
		Thread.sleep(2000);

		// Password
		driver.findElement(By.xpath("//*[@id=\"create_password\"]")).sendKeys("Saurabh@3552");
		Thread.sleep(2000);

		// CheckBox1
		driver.findElement(By.xpath("//*[@id=\"privacy_policy\"]")).click();
		Thread.sleep(2000);

		// CheckBox2
		driver.findElement(By.xpath("//*[@id=\"terms_condition\"]")).click();
		Thread.sleep(2000);

		// Register button
		driver.findElement(By.xpath("//*[@id=\"checkValidation\"]")).click();
		Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest()
	{
		driver.close();
	}

}
