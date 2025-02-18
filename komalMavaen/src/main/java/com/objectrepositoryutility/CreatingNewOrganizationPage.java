package com.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganizationPage {
	WebDriver driver=null;
	public CreatingNewOrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="accountname")
	private WebElement orgNameEdt;
	
	@FindBy(name="button")
	private WebElement saveBtn;
	

	@FindBy(name="industry")
	private WebElement industrtDD;
	
	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getSavebtn() {
		return saveBtn;
	}

	public WebElement getIndustrtDD() {
		return industrtDD;
	}

	public WebElement getTypeDD() {
		return typeDD;
	}

	public WebElement getPhoneNum() {
		return phoneNum;
	}
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	 @FindBy(id="phone")
	  private WebElement phoneNum;
	
	 public void createOrg(String orgName) {
		 orgNameEdt.sendKeys(orgName);
		 saveBtn.click();
	 }
	 
	 public void createorg(String orgName,String pindustry,String typedd) {
		 orgNameEdt.sendKeys(orgName);
		 Select sel=new Select(industrtDD);
		 sel.selectByValue(pindustry);
		 
		 Select sel1=new Select(typeDD);
		 sel.selectByValue(typedd);
		 
		 saveBtn.click();
	 }
	 
	 public void createorg(String orgName,String num) {
		 orgNameEdt.sendKeys(orgName);
		 phoneNum.sendKeys(num);
		 saveBtn.click();
	 }
}
