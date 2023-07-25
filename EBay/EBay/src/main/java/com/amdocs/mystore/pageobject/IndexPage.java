/**
 * 
 */
package com.amdocs.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.ebay.base.BaseClass;

public class IndexPage extends BaseClass {
	@FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"gh-logo\"]")
    WebElement mystoreLog;

    @FindBy(xpath="//*[@id=\"gh-ac\"]")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"gh-btn\"]")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"gh-ug-flex\"]/a")
    WebElement register;

//    in
    public IndexPage() {
        PageFactory.initElements(getDriver(), this);
    }
    
    public boolean validateLogo() throws Throwable {
        return Action.isDisplayed(getDriver(), mystoreLog);

    }
    public LoginPage clickonSignIn() throws Throwable {
        Action.click(getDriver(), signIn);
        return new LoginPage();
    }

    public SignUp clickonSignUp()
    {
        Action.click(getDriver(), register);
        return new SignUp();
    }

    public String getTitle() {
         String title = getDriver().getTitle();
         return title;
    }
    
    public ItemPage searchProduct(String productName) throws InterruptedException {
    	Action.type(searchBar, productName);
    	Action.scrollByVisibilityOfElement(getDriver(), searchButton);
    	Action.click(getDriver(), searchButton);
    	Thread.sleep(3000);
    	return new ItemPage();
    }
}
