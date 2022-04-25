package ITCStore_Project;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class ITCStore_DDT
{
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
  
	@Test(dataProvider = "LoginData")
  public void f(String  username, String password) throws Exception
	{ 
		ITCStore_POM  o= new ITCStore_POM();
	
		//Create Object Of POM Class
				
				o.maximizeBrowser(driver);
				o.url(driver);
				o.window(driver);
				o.myAccount(driver);
				Thread.sleep(2000);
				o.login(driver);
				Thread.sleep(2000);
			    o.userName(driver,username );
				o.passWord(driver,password);
				Thread.sleep(2000);
				o.loginButton(driver);
				Thread.sleep(2000);
				o.module(driver);
				Thread.sleep(2000);
				o.Account(driver);
				Thread.sleep(2000);
				
				o.logOut(driver);
				o.closeBrowser(driver);	
	}
	

  @DataProvider (name="LoginData")
  public Object[][] getData()
  {
      String loginData[][]={   
    		                  { "saurabhd3552@gmail.com", "Saurabh@3552" },
  		                      { "Demo@1234", "Demo1" },
                            
                           };
   
      return loginData;
    };
    
  
  
  @AfterTest
  public void afterTest()
 {
 	driver.close();
 }
}