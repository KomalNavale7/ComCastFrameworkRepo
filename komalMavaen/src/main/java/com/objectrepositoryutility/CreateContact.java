package com.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {
	WebDriver driver=null;
	public CreateContact (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(name="lastname")
private WebElement lastname;

 @FindBy(name="button")
 private WebElement savecontact;

public WebElement getLastname() {
	return lastname;
}

public WebElement getSavecontact() {
	return savecontact;
}
 
}
