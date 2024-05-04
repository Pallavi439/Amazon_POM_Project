package demoQA_page;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import Excelutilty.Excelregrestration;

public class RegistrationPage extends Excelregrestration
{
	
WebDriver driver;

	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement Hoverover;
	
	@FindBy(xpath="//div[@id='nav-flyout-ya-newCust']//a[text()='Start here.']")
	WebElement starthere;
	
	@FindBy(id="ap_customer_name")
	WebElement fullname;
	
	@FindBy(id="ap_phone_number")
	WebElement mobileNumber;
	
	@FindBy(id="ap_password")
	WebElement passoword;
	
	@FindBy(id="continue")
	WebElement clickonVerify;
	
	public void clickonAccountAndLists(WebDriver driver) throws IOException
	{
		
		Actions ac=new Actions(driver);
		ac.moveToElement(Hoverover).perform();
		starthere.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dis=new File("C:\\Users\\Surendra\\Downloads\\AmazonProject\\AmazonProject\\Screenshots\\reg.png");
		FileUtils.copyFile(src, dis);
		
	}

	public void userdetails() throws InvalidFormatException, IOException
	{
		getExceldata();
		
		fullname.sendKeys(name);
		mobileNumber.sendKeys(mobile);
		passoword.sendKeys(password);
		
		clickonVerify.click();
		
		
	}
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

