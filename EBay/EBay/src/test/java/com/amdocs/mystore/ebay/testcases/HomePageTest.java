/**
 * 
 */
package com.amdocs.mystore.ebay.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.ebay.base.BaseClass;
import com.amdocs.mystore.pageobject.HomePage;
import com.amdocs.mystore.pageobject.IndexPage;
import com.amdocs.mystore.pageobject.SearchResultPage;

public class HomePageTest extends BaseClass {
	
	HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		getDriver().quit();
//	}
	
	@Test
	public void searchBar() {
		homePage = new HomePage();
		homePage.searchProduct(prop.getProperty("ProductName"));
        		
	}
}
