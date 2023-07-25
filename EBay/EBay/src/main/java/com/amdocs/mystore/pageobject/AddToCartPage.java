/**
 * 
 */
package com.amdocs.mystore.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.ebay.base.BaseClass;

public class AddToCartPage extends BaseClass{
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[2]/div[2]/div/div[1]/button")
	WebElement checkOut;
	
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void checkOutPage() {
//		getDriver().manage().timeouts().implicitlyWait
//        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(getDriver(), 300);
//	      wait.until(ExpectedConditions.elementToBeClickable(checkOut));
		Action.click(getDriver(), checkOut);
	}

}
