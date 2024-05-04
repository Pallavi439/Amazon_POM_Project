package demoqa_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Listner.TestListner;

public class LaunchAndQuit extends TestListner
{
	
	//WebDriver driver;
	  @BeforeMethod
	public void launchBrowser()
	{
//@Parameters("browser")
//  
//	public void launchBrowser(String name_of_browser)
//	{
//		if(name_of_browser.equals("chrome"))
//  	 {
//  		 driver = new ChromeDriver();
//   	 }
//   	 if(name_of_browser.equals("Edge"))
//   	 {
//   		 driver = new EdgeDriver();
//   	 }
		driver=new ChromeDriver();
   	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	
//	@AfterMethod
//	public void closeBrowser() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.close();
//	}
}
