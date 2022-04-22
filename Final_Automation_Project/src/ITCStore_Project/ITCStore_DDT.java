package ITCStore_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ITCStore_DDT 
{

	public static void main(String[] args) throws Exception 
	{
		 
			//Part 1: ExcelSheet ---> Store Test Data in form of variables
			  FileInputStream file=new FileInputStream("C:\\Users\\HP\\Documents\\Automation testing\\POI.xlsx");
			  XSSFWorkbook w=new XSSFWorkbook(file);
			  XSSFSheet s=w.getSheet("DataDrivenFrameworkITCStore");
			
			  int rowSize=s.getLastRowNum();
			  System.out.println("No. Username & Password: "+rowSize);

				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				Thread.sleep(2000);
			  
			  //Maximize Browser
		      driver.manage().window().maximize();
					
			  //Create Object of POM
		      ITCStore_POM  o=new ITCStore_POM();
					
				
					for(int i=1; i<=rowSize; i++)
					{
						
						String email=s.getRow(i).getCell(0).getStringCellValue();
						String Password=s.getRow(i).getCell(1).getStringCellValue();
						System.out.println(email+"\t\t"+Password);
						
						//Part 2: Launch Application
						try
						{
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
						
							
							//Part 3: Update Result
							System.out.println("Valid Username & Password.");
							System.out.println("");
							s.getRow(i).createCell(2).setCellValue("Valid Username & Password.");
						}
						catch (Exception e)
						{
							System.out.println("Invalid Username & Password.");
							System.out.println("");
							s.getRow(i).createCell(2).setCellValue("Invalid Username & Password.");
						}
				
					}
					
					FileOutputStream out=new FileOutputStream("C:\\Users\\HP\\Documents\\Automation testing\\POI.xlsx");
					w.write(out);
					w.close();
					
					
	}

}
