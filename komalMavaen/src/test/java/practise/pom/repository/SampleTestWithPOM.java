package practise.pom.repository;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SampleTestWithPOM {

	@FindBy(name="user_name")
	WebElement ele1;
	
	@FindBy(name="user_password")
	WebElement ele12;
	
	@FindBy(id="submitButton")
	WebElement ele3;
	
	@Test
	public void SampleTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://49.249.28.218:8888/");
		
		SampleTestWithPOM s = PageFactory.initElements(driver,SampleTestWithPOM.class);
		s.ele1.sendKeys("admin");
		s.ele12.sendKeys("admin");
//		s.ele3.click();
		driver.navigate().refresh();
		s.ele1.sendKeys("admin");
		s.ele12.sendKeys("admin");
		s.ele3.click();
				
	}
}
