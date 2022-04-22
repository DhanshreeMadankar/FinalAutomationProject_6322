package ITCStore_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ITCStore_MainClass
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//Create Object Of POM Class
		ITCStore_POM  o=new ITCStore_POM();
		o.maximizeBrowser(driver);
		o.url(driver);
		o.window(driver);
		o.myAccount(driver);
		o.login(driver);
		o.email(driver, "saurabhd3552@gmail.com");
		o.passWord(driver, "Saurabh@3552");
		o.loginButton(driver);
		
		o.logoutAccount(driver);
		Thread.sleep(2000);
		
		o.logOut(driver);
		o.closeBrowser(driver);	
	

	}

}
