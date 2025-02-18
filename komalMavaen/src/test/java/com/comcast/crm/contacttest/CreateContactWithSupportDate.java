package com.comcast.crm.contacttest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactWithSupportDate {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\SANMESH\\Desktop\\Selenium\\commondata.properties");
		   Properties pobj=new Properties();
		   pobj.load(fis);
		   
		      String BROWSER = pobj.getProperty("browser");
		   String URL = pobj.getProperty("url");
		   String UN = pobj.getProperty("username");
		   String PWD = pobj.getProperty("password"); 
		   Random random=new Random();
		    int randomint = random.nextInt(1000);
		  
		   FileInputStream fis1=new FileInputStream("C:\\Users\\SANMESH\\Desktop\\TestData.xls.xlsx");
		   Workbook wb = WorkbookFactory.create(fis1);
		  Sheet sh = wb.getSheet("org");
		  Row row = sh.getRow(1);
		  String orgname = row.getCell(2).toString();
		  wb.close();
		   
		    
		   WebDriver driver=null;
		   if(BROWSER.equals("Chrome")) {
			   driver=new ChromeDriver();
		   }else if(BROWSER.equals("Firefox")) {
			   driver=new FirefoxDriver();
		   }else if(BROWSER.equals("Edge")) {
			   driver=new EdgeDriver();
		   }else
			   driver=new ChromeDriver();
			
		   driver.get(URL);
		   driver.findElement(By.name("user_name")).sendKeys("admin");
		   driver.findElement(By.name("user_password")).sendKeys("admin");
		   driver.findElement(By.id("submitButton")).sendKeys(Keys.ENTER);
		   
		   driver.findElement(By.linkText("Contacts")).click();
		   driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		  
		   driver.findElement(By.name("lastname")).sendKeys("N");

		   WebElement strtDate = driver.findElement(By.name("support_start_date"));
		   strtDate.clear();
		   strtDate.sendKeys("2025-02-07");
		   WebElement endDate = driver.findElement(By.name("support_end_date"));
		   endDate.clear();
		   endDate.sendKeys("2025-03-06");
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
}
