package demoQA_page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithValidPage 
{
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement emailfield;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement passwordField;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
	
	public void signin()
	{
		signin.click();
	}
	
	
	public void userLoginDetails() throws IOException
	{
		
		
		emailfield.sendKeys("9067259501");
		continuebutton.click();
		passwordField.sendKeys("Best@123");
		signInButton.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\Surendra\\Downloads\\AmazonProject\\AmazonProject\\Screenshots\\login.png");
		FileUtils.copyFile(src, dist);
		
		
	
	}
	
	public LoginWithValidPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
