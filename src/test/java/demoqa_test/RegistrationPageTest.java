package demoqa_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import demoQA_page.RegistrationPage;

public class RegistrationPageTest extends LaunchAndQuit
{
	
	
	@Test
	public void resgistrationtest() throws InvalidFormatException, IOException 
	{
	
	 RegistrationPage ob=new RegistrationPage(driver);
	 ob.clickonAccountAndLists(driver);
	 ob.userdetails();
	 
	 
	
	}
	
	
}
