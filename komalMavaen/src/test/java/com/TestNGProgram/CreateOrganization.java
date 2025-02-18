package com.TestNGProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClassutility.BaseUtility;
import com.ListenerUtility.ListnerImpClass;
import com.aventstack.extentreports.Status;
import com.objectrepositoryutility.CreateContact;
import com.objectrepositoryutility.CreatingNewOrganizationPage;
import com.objectrepositoryutility.HomePage;
import com.objectrepositoryutility.OrganizationInformation;
import com.objectrepositoryutility.Organizationpage;

import genericWebDriverUtility.UtilityClassObject;
import lombok.experimental.UtilityClass;

public class CreateOrganization extends BaseUtility {

@Test
public void Createorg() throws Throwable {
	 
    /*ListnerImpClass.test.log(Status.INFO, "read data from Excel");/
	/*===this is participated in parallel execution also====*/
	UtilityClassObject.getTest().log(Status.INFO, "read data from Excel");
	
	HomePage hp=new HomePage(driver);
	hp.getOrg().click();
	
	Organizationpage op=new Organizationpage(driver);
	op.getPlus().click();
	
	String orgname = elib.getDataFromExcel("org", 2, 2)+jlib.getRandomNumber();
	
	CreatingNewOrganizationPage cnp=new CreatingNewOrganizationPage(driver);
	cnp.getOrgNameEdt().sendKeys(orgname);
	cnp.getSavebtn().click();
	}
//@Test
//public void CreateOrgWithPhoneNumberTest() throws Throwable {
//	UtilityClassObject.getTest().log(Status.INFO, "read data from Excel");
//	String orgName = elib.getDataFromExcel("org", 1, 2)+jlib.getRandomNumber();
//	String PhoneNumber = elib.getDataFromExcel("org", 2, 2);
//	
//	/* Navigate To Organization Module*/
//	UtilityClassObject.getTest().log(Status.INFO, "Create a new Org");
//	HomePage hp=new HomePage(driver);
//	hp.getOrg().click();
//	
//	/*click on create organization button*/
//	Organizationpage cnp=new Organizationpage(driver);
//	cnp.getPlus().click();
//	
//	CreatingNewOrganizationPage cnop=new CreatingNewOrganizationPage(driver);
//	cnop.getPhoneNum();
//	
//	OrganizationInformation oip=new OrganizationInformation(driver);
//	String actOrgName = oip.getHeadermsg().getText();
//	
//	Assert.assertEquals(true,actOrgName.contains(orgName));
//	String actPhoneNumber = oip.getPhone().getText();
//	
//
//	Assert.assertEquals(actPhoneNumber,PhoneNum);
//	
//	
//	
}

