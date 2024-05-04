package demoqa_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import demoQA_page.Task09_AddToCartSuccessfully;

public class Task09_AddToCartSuccessfullyTest extends LaunchAndQuit
{

	@Test
	public void gettest() throws InvalidFormatException, IOException
	{
		Task09_AddToCartSuccessfully ob=new Task09_AddToCartSuccessfully(driver);
		ob.searchbox();
		ob.addedtocart(driver);
	}
}
