package com.BaseClassutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.genericutility.ExcelUtility;
import com.comcast.crm.genericutility.FileUtility;
import com.objectrepositoryutility.HomePage;
import com.objectrepositoryutility.LoginPage;

import genericDataBaseUtility.DataBaseUtility;
import genericWebDriverUtility.JavaUtility;
import genericWebDriverUtility.UtilityClassObject;
import genericWebDriverUtility.WebDriverutility;
import lombok.experimental.UtilityClass;

public class BaseUtility {
	
	public DataBaseUtility dlib=new DataBaseUtility();
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriverutility wu=new WebDriverutility();
	public WebDriver driver=null;
	public static  WebDriver sdriver=null;
	
	
	@BeforeSuite
//	public void configBS() {
//		System.out.println("=========Coonect to db,Report Config=========");
//		dlib.getdbConnection();
//	}
//		
		
	@BeforeClass(alwaysRun = true)
	public void ConfigBC() throws Throwable {
		System.out.println("launch a Browser");
		String BROWSER = flib.getdatafrompropertyfile("browser");
		if(BROWSER.equals("Chrome"))
		{
			driver=new ChromeDriver();	
		}else if(BROWSER.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if(BROWSER.equals("Edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		sdriver=driver;
		String URL = flib.getdatafrompropertyfile("url");
//         wu.getMaximize();
//         wu.getImplicitwait();
		driver.get(URL);
		UtilityClassObject.setDriver(driver);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void ConfigBM() throws Throwable {
		System.out.println("====login===");
		String UN = flib.getdatafrompropertyfile("username");
		String PWD = flib.getdatafrompropertyfile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(UN, PWD);
	}
	@AfterMethod(alwaysRun = true)
	public void ConfigAM() {
		System.out.println("====Logout====");
		HomePage hp=new HomePage(driver);
		hp.getLogOut();
				
	}
	@AfterClass(alwaysRun = true)
	public void ConfigAC() {
		System.out.println("====close the Browser===");
		driver.quit();
	}
//	@AfterSuite(alwaysRun = true)
//	public void ConfigAS() {
////		System.out.println("=====close Db,Report Backup=====");
////		dlib.getCloseConnection()
//		}
//	}
//	

}
