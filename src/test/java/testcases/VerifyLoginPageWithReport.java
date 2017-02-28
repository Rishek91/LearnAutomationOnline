package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import pages.LogInPage;

public class VerifyLoginPageWithReport {

	WebDriver driver;
	ExtentReports reports;
	ExtentTest logger;
	

	@BeforeMethod
	public void setup() {
	 reports=new ExtentReports(".//Reports//MyOrder.html",true);
	  logger=reports.startTest("Verify Test Login","Test case got started");

		 driver = BrowserFactory.getBrowser("FireFox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		 logger.log(LogStatus.INFO,"Application is up and running");

	}

	@Test

	public void testHomepage() {

		HomePage home = PageFactory.initElements(driver, HomePage.class);

		String Titel = home.ApplicationgetTitle();
		home.clickonSignINLink();
		logger.log(LogStatus.INFO,"Click on SigninLink");

		//Assert.assertTrue(Titel.contains("Online Shopping Store | Buy Online: Mobiles Phone, Computers, Tablets Pc, Home Appliances | Lowest Price shop in India at ShopClues "));
		
		LogInPage login=PageFactory.initElements(driver, LogInPage.class);
		login.SignUPapplication(DataProviderFactory.getExcel().getexceldata("LogIn",0,0),DataProviderFactory.getExcel().getexceldata("LogIn",0,1));
		logger.log(LogStatus.INFO,"Login to Application");
		login.verifyMyOrder();
		logger.log(LogStatus.PASS,"My Order Button Verified");

	}

	@AfterMethod
	public void TearDown() {
		BrowserFactory.closeBrowser(driver);
		reports.endTest(logger);
		reports.flush();
	}
}
