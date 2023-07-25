/**
 * 
 */
package com.amdocs.mystore.ebay.testcases;

import javax.naming.directory.SearchResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.ebay.base.BaseClass;
import com.amdocs.mystore.pageobject.AddToCartPage;
import com.amdocs.mystore.pageobject.HomePage;
import com.amdocs.mystore.pageobject.IndexPage;
import com.amdocs.mystore.pageobject.ItemPage;
import com.amdocs.mystore.pageobject.LoginPage;
import com.amdocs.mystore.pageobject.SearchResultPage;

public class AddToCartTest extends BaseClass{
	
	HomePage homePage;
	SearchResultPage searchResultPage;
    ItemPage itemPage;
    AddToCartPage addToCartPage;
    
//    public  AddToCartTest() {
//    	
//    }
    
    @BeforeMethod
    public void setUp() {
    	launchApp();
    }
    
//    @AfterMethod
//    public void tearDown() {
//    	getDriver().quit();
//    }
    
    @Test
    public void addToCartTest() throws Throwable {
    
    	homePage=new HomePage();
    	addToCartPage = new AddToCartPage();
    	itemPage = new ItemPage();
    	searchResultPage = new SearchResultPage();
    	
    	homePage.searchProduct(prop.getProperty("ProductName"));
    	searchResultPage.selectItem();
     
    	Action.launchNewWindow(getDriver());
     
    	itemPage.addToCart();
    	addToCartPage.checkOutPage();
    }
    
}
