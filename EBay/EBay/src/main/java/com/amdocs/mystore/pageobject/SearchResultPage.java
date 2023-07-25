/**
 * 
 */
package com.amdocs.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.ebay.base.BaseClass;

public class SearchResultPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"item4de6b12e7b\"]/div/div[2]/a/div/span")
	WebElement selectedProduct;
	
	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public ItemPage selectItem() {
	  Action.click(getDriver(), selectedProduct);
	  return new ItemPage();
	}


	public  void click(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}


}
