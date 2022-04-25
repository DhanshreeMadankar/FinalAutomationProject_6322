package ITCStore_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ITCStore_POM 
{
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
	    driver.get("https://itcstore.in/");
	}
	public void window(WebDriver driver)
	{
	    driver.findElement(By.xpath("//*[@id=\"zip-skip\"]")).click();
	}
	public void myAccount(WebDriver driver)
	{
	    driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]")).click();
	}
	public void login(WebDriver driver)
	{
	    driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div[2]/div/div/div[1]/div/div")).click();
	}
	public void userName(WebDriver driver, String usn)
	{
	    driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys(usn);
	}
	public void passWord(WebDriver driver, String pwd)
	{
	    driver.findElement(By.xpath("//*[@id=\"customer_password\"]")).sendKeys(pwd);
	}
	public void loginButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"login_submit_btn\"]")).click();
	}
	public void module(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li[8]/a")).click();
	}
	public void Account(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header-supermarket\"]/header/div/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/a")).click();
	}
	public void logOut(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"customer_logout_link\"]")).click();
	}
	public void closeBrowser(WebDriver driver)
	{
	    driver.close();
	}

}
