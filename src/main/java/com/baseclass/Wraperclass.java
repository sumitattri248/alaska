package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wraperclass 

{
	protected static WebDriver driver;
public void launchbrowser(String url)
{
	System.setProperty("webdriver.chrome.driver","C:\\845043\\alaska\\src\\test\\resources\\Driver\\chromedriver_v80.exe");
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get(url);
	driver.manage().window().maximize();
}
public void Screenshot(String path) throws IOException

{
	TakesScreenshot st=(TakesScreenshot) driver;
	File a=st.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(a,new File( path));
}
public void quit()
{
driver.close();
}
}
