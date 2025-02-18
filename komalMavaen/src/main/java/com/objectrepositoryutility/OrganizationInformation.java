package com.objectrepositoryutility;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformation {
       
	WebDriver driver=null;
	public OrganizationInformation(WebDriver driver)
	{
	  this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  @FindBy(name="dvHeaderText")
  private WebElement headermsg;
  
  @FindBy(name="industry")
  private WebElement industry;
  
  @FindBy(name="accounttype")
  private WebElement type;
  
  @FindBy(id="phone")
  private WebElement phone;
  
public WebElement getHeadermsg() {
	return headermsg;
}

public WebElement getIndustry() {
	return industry;
}

public WebElement getType() {
	return type;
}

public WebElement getPhone() {
	return phone;
}
  
  
}