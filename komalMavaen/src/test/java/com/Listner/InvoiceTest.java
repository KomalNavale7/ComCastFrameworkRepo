package com.Listner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClassutility.BaseUtility;

@Listeners(com.ListenerUtility.ListnerImpClass.class)
public class InvoiceTest extends BaseUtility{
@Test
public void activateSim() {
	
	System.out.println("execute CreateInvoiceTest");
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle, "login");
	System.out.println("Step-1");
}

@Test
public void CreateInovoiceWithContactTest() {
	System.out.println("execute CreateInvoiceWithContactTest");
	System.out.println("Step-1");
}
}
