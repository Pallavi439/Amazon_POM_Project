package Listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener,IRetryAnalyzer {
   public static WebDriver driver;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dis=new File("C:\\Users\\Surendra\\Downloads\\AmazonProject\\AmazonProject\\Screenshots\\Ontest.png");
		try {
			FileUtils.copyFile(src, dis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dis=new File("C:\\Users\\Surendra\\Downloads\\AmazonProject\\AmazonProject\\Screenshots\\Testsucess.png");
		try {
			FileUtils.copyFile(src, dis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestSuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dis=new File("C:\\Users\\Surendra\\Downloads\\AmazonProject\\AmazonProject\\Screenshots\\Ontestfail.png");
		try {
			FileUtils.copyFile(src, dis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		TestListner t=new TestListner();
		t.retry(result);
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int number_of_times=2;

		int from =0;

			if(from<=number_of_times)

			{
				from++;

				return true;

			}return false;

		}
		
	

}
