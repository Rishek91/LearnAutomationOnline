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

public class VerifyHomePage {

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

		Assert.assertTrue(Titel.contains("Home- India's Leading "));

	}

	@AfterMethod
	public void TearDown() {
		BrowserFactory.closeBrowser(driver);
	}
}
