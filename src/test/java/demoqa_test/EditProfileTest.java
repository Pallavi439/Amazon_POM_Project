package demoqa_test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listner.TestListner;
import demoQA_page.EditProfile;

@Listeners(TestListner.class)
public class EditProfileTest extends LaunchAndQuit
{
	@Test
	public void ditprofileTest()
	{
		Assert.assertEquals(false, true);
		EditProfile ob=new EditProfile(driver);
		ob.signin();
		
		//ob.userLoginDetails();
		//ob.clickonAccountAndList();
		//ob.loginSection();
		//ob.editSection();
		
	}
}
