package com.TestNGProgram;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
Listeners(com.ListenerUtility.ListnerImpClass.class)
public class SampleReportTest {

@Test
public void createContactTest() {
	
	ExtentTest test = report.createTest("createContactTest");
	
	test.log(Status.INFO,"login to app");
	test.log(Status.INFO,"navigate to contact page");
	test.log(Status.INFO,"Create Contact");
	if("HDFC".equals("HDFC")) {
		test.log(Status.PASS,"Contact is created");
	}else {
		test.log(Status.FAIL,"Contact is not created");
	}
	
	test.log(Status.INFO,"login to app");
}
}
