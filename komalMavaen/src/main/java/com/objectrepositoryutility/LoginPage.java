package com.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.genericutility.FileUtility;

public class LoginPage 
{
WebDriver driver=null;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement UN;
	
	@FindBy(name="user_password")
	private WebElement PWD;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUN() {
		return UN;
	}

	public WebElement getPWD() {
		return PWD;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void loginToApp(String un,String p){
		UN.sendKeys(un);
		PWD.sendKeys(p);
		loginbtn.click();
	}
}
