package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import pages.LogInPage;

public class VerifyLoginPage {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = BrowserFactory.getBrowser("FireFox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());

	}

	@Test

	public void testHomepage() {

		HomePage home = PageFactory.initElements(driver, HomePage.class);

		String Titel = home.ApplicationgetTitle();
		home.clickonSignINLink();

		//Assert.assertTrue(Titel.contains("Online Shopping Store | Buy Online: Mobiles Phone, Computers, Tablets Pc, Home Appliances | Lowest Price shop in India at ShopClues "));
		
		LogInPage login=PageFactory.initElements(driver, LogInPage.class);
		login.SignUPapplication(DataProviderFactory.getExcel().getexceldata("LogIn",0,0),DataProviderFactory.getExcel().getexceldata("LogIn",0,1));
		login.verifyMyOrder();

	}

	@AfterMethod
	public void TearDown() {
		BrowserFactory.closeBrowser(driver);
	}
}
