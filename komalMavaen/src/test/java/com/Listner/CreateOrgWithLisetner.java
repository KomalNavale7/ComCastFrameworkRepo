package com.Listner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClassutility.BaseUtility;
import com.objectrepositoryutility.CreatingNewOrganizationPage;
import com.objectrepositoryutility.HomePage;
import com.objectrepositoryutility.Organizationpage;
@Listeners(com.ListenerUtility.ListnerImpClass.class)
public class CreateOrgWithLisetner extends BaseUtility {
	@Test
	public void Createorg() throws Throwable {
		
		HomePage hp=new HomePage(driver);
		hp.getOrg().click();
		
		Organizationpage op=new Organizationpage(driver);
		op.getPlus().click();
		
		String orgname = elib.getDataFromExcel("org", 2, 2)+jlib.getRandomNumber();
		Assert.fail();
		
		CreatingNewOrganizationPage cnp=new CreatingNewOrganizationPage(driver);
		cnp.getOrgNameEdt().sendKeys(orgname);
		cnp.getSavebtn().click();
}
	}
