package com.amdocs.mystore.ebay.testcases;

import org.testng.annotations.Test;

import com.amdocs.mystore.pageobject.PaymentPage;

public class PaymentPages {
	PaymentPage paymentPage;
	
	@Test
	public void paymentPage() {
		paymentPage = new PaymentPage();
		paymentPage.paymentSection();
	}

}
