package com.TestNGProgram;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
@Listeners(com.ListenerUtility.ListnerImpClass.class)
public class CreateContactTestWithScreenshot {


@Test
	public void createContactTestSS() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://49.249.28.218:8888");
	
		TakesScreenshot tks=(TakesScreenshot)driver;
		String filepath = tks.getScreenshotAs(OutputType.BASE64);
		
		ExtentReports report=new ExtentReports();
		
	ExtentTest test = report.createTest("createContactTestSS");
	
	test.log(Status.INFO,"login to app");
	test.log(Status.INFO,"navigate to contact page");
	test.log(Status.INFO,"Create Contact");
	if("HDDFC".equals("HDFC")) {
		test.log(Status.PASS,"Contact is created");
	}else {
		test.log(Status.FAIL,"Contact is not created");
	}
	
	test.addScreenCaptureFromBase64String(filepath,"Errorfile");
	driver.close();
}
}
