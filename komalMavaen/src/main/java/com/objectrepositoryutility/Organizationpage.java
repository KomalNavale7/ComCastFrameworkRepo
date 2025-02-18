package com.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	WebDriver driver=null;
	public Organizationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement plus;
	
	@FindBy(name="search_text")
	private WebElement searchBox;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchDD;
	
	@FindBy(name="submit")
	private WebElement searchbtn;
	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchDD() {
		return searchDD;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	
	
	
}
