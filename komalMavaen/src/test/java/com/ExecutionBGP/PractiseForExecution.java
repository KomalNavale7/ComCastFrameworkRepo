
package com.ExecutionBGP;

import org.testng.annotations.Test;

import com.BaseClassutility.BaseUtility;

public class PractiseForExecution extends BaseUtility {
@Test(groups = "smoke")
public void Samplemethod1() {
	System.out.println("Method1");
}
@Test(groups = "regression")
public void Samplemethod2() {
	System.out.println("Method2");
}
@Test(groups = "regression")
public void Samplemethod3() {
	System.out.println("Method3");
}


}
