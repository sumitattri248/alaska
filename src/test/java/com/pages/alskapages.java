package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class alskapages
{
//	Whale watching link
@FindBy(xpath="//*[@id='textWithUI-262899300']/div/div[2]/a")
public WebElement whale;
//menu button
@FindBy(xpath="//div[@class='headerMainToolbar__menu__icon']")
public WebElement menubutton ;
//plane cruise
@FindBy(xpath="//*[@id='rciHeaderSideNavMenu-1']/span")
public WebElement planecruise ;
//find cruise
@FindBy(xpath="//*[@id='rciHeaderSideNavSubmenu-1-1']/span")
public WebElement findcruise ;
//ships
@FindBy(xpath="//*[@id='rciHeaderMenuItem-2']")
public WebElement ships ;
//rapsody
@FindBy(xpath="//*[@id='staticGalleryComponent-1105619135']/a/div/figure/div")
public WebElement rapsody ;
//deckplan
@FindBy(xpath="//*[@id='superHero-1073688544']/div[4]/div/div/div/div/div[3]/a")
public WebElement deckplan ;
//decktwo
@FindBy(xpath="//*[@id='deckDropdown']")
public WebElement decktwo ;


//royalsuite
@FindBy(xpath="//*[@id='deck-plans-template']/section/section[2]/section[1]/div[2]/section[5]/h4")
public WebElement royalsuite;
public String whalelink()
{
	String b=whale.getText();
	return b;
	
}
public String Royalsuitelink() throws InterruptedException
{
	menubutton.click();
	planecruise.click();
	findcruise.click();
	Thread.sleep(20000);
	ships.click();
	Thread.sleep(30000);
	rapsody.click();
	Thread.sleep(20000);
	deckplan.click();
	Thread.sleep(20000);
	WebElement c=decktwo;
	Select sel=new Select(c);
	sel.selectByVisibleText("Deck Eight");
	String d=royalsuite.getText();
	return d;
	
}
}
