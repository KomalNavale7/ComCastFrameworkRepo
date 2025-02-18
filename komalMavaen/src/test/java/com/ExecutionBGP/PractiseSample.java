package com.ExecutionBGP;

import org.testng.annotations.Test;

import com.BaseClassutility.BaseUtility;

public class PractiseSample extends BaseUtility{
@Test(groups = "smoke")
public void Samplemethod4() {
	System.out.println("Method4");
}
@Test(groups = "regression")
public void Samplemethod5() {
	System.out.println("Method5");
}
@Test(groups = "smoke")
public void Samplemethod6() {
	System.out.println("Method6");
}

}
