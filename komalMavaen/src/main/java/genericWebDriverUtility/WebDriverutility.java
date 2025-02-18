package genericWebDriverUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverutility {
	WebDriver driver;
	public void getMaximize() {
		driver.manage().window().maximize();
	}
	
 public void getImplicitwait() {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	 
 }

 public void getExplicitwait() {
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
 }
 public void SelectDropdwonByIndex(WebElement element,int index) {
	 Select sel=new Select(element);
	 sel.selectByIndex(index); 
 }
 
 public void SelectDropdwonByText(WebElement element, String text) {
	 Select sel=new Select(element);
	 sel.selectByVisibleText(text);
}
 public void SelectDropdwonByValue(WebElement element,String value) {
	 Select sel=new Select(element);
	 sel.selectByValue(value);
}
public void switchToAlertAndAccept() {
	driver.switchTo().alert().accept();
}
public void switchToAlertAndDismiss() {
	driver.switchTo().alert().dismiss();
}
public void MouseAction(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
}


