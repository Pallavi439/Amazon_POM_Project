package demoqa_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import demoQA_page.Task11_Validate_EntireCheckOut;

//Validate the entire checkout process 
public class Task11_Test extends LaunchAndQuit
{
	
	@Test
	public void logintest() throws InvalidFormatException, IOException
	{
		Task11_Validate_EntireCheckOut obj=new Task11_Validate_EntireCheckOut(driver);
		obj.signin();
		obj.userLoginDetails();
		obj.searchbox();
		obj.addedtocart(driver);
		obj.changeAddress();
		obj.updatingAddress();
		
	}

}
