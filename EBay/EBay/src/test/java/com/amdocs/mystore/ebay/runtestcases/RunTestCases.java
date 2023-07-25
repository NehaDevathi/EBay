package com.amdocs.mystore.ebay.runtestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.ebay.base.BaseClass;
import com.amdocs.mystore.ebay.testcases.LoginPageTest;
import com.amdocs.mystore.ebay.testcases.PaymentPages;
import com.amdocs.mystore.pageobject.AddToCartPage;
import com.amdocs.mystore.pageobject.HomePage;
import com.amdocs.mystore.pageobject.ItemPage;
import com.amdocs.mystore.pageobject.SearchResultPage;

public class RunTestCases extends BaseClass{
	HomePage homePage;
	SearchResultPage searchResultPage;
    ItemPage itemPage;
    AddToCartPage addToCartPage;
    LoginPageTest loginPageTest;
    PaymentPages paymentPage;
    
//    public  AddToCartTest() {
//    	
//    }
    
    @BeforeMethod
    public void setUp() {
    	launchApp();
    }
    
    @AfterMethod
    public void tearDown() {
    	getDriver().quit();
    }
    
    @Test
    public void addToCartTest() throws Throwable {
    
    	loginPageTest = new LoginPageTest();
    	homePage=new HomePage();
    	addToCartPage = new AddToCartPage();
    	itemPage = new ItemPage();
    	searchResultPage = new SearchResultPage();
    	paymentPage = new PaymentPages();
    	
    	loginPageTest.loginTest();
    	homePage.searchProduct(prop.getProperty("ProductName"));
    	searchResultPage.selectItem();
     
    	Action.launchNewWindow(getDriver());
     
    	itemPage.addToCart();
    	getDriver().manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
    	addToCartPage.checkOutPage();
    	
    	paymentPage.paymentPage();
    	
    }
}
