package ITCStore_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ITCStore_MouseHover 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://itcstore.in/");
	    
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
	    
	    //Step 1: Create Object of Action Class
	    Actions a=new Actions(driver);
	    
	    //Step 2: Create Object of List with WebElement
	    List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li"));
	  
	    //Step 3: Store size of list
	    int listSize=ls.size();
	    System.out.println("No.of Modules: "+listSize);
	    
	    //Step 4: For loop
	    for(int i=1; i<=listSize; i++)
	    {
	    	//Wait
	    	 Thread.sleep(2000);
	    	 
	    	//Display Module Name
	    	 System.out.println(driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li["+i+"]")).getText());
	    	 
	    	//Perform Mouse Hover
	    	 a.moveToElement(driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[2]/div/div/div/div/nav/ul[1]/li["+i+"]"))).click().perform();
	    	 
	    	 
	    }
	}

}


