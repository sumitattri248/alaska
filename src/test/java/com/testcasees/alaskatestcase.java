package com.testcasees;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclass.Wraperclass;
import com.pages.alskapages;

public class alaskatestcase extends Wraperclass
{
	 alskapages j;
@BeforeTest
public void beforetest()
{
	launchbrowser("https://www.royalcaribbean.com/alaska-cruises");
}
@Test
public void Test1() throws InterruptedException
{
	j=PageFactory.initElements(driver, alskapages.class);
	String v=j.whalelink();
	String k=j.Royalsuitelink();
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(v, "whale watching tour");
	soft.assertEquals(k, "Royal Suite - 1 Bedroom");
	soft.assertAll();
}
@AfterTest
public void aftertest()
{
	quit();
}
}
