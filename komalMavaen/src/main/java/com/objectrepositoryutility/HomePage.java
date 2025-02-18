package com.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver=null;
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
        @FindBy(linkText="Organizations")
        private WebElement Org;
        
        @FindBy(linkText = "Contacts")
        private WebElement Cont;
        
        @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
        private WebElement admin;

        @FindBy(linkText = "Sign Out")
       private WebElement signout;
        
		public WebElement getOrg() {
			return Org;
		}

		public WebElement getCont() {
			return Cont;
		}

		

		public WebElement getSignout() {
			return signout;
		}

		public WebElement getAdmin() {
			return admin;
		}
        
        public void getOrgPage() {
  Org.click();        	
        }
        
        public void getContactPage()
        {
        	Cont.click();
        }
        
        public void getLogOut()
        {
        	Actions act=new Actions(driver);
        	act.moveToElement(admin).perform();
        	act.click(signout).perform();
        	
        }
}
