package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogInPage {
	
	WebDriver driver;
	
	public LogInPage(WebDriver ldriver){
		this.driver=ldriver;
		}
	
	@FindBy(xpath=".//*[@id='email']") WebElement LoginID;
	
	@FindBy(xpath=".//*[@id='password']") WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']") WebElement Login;
	
	By MyOrder=By.xpath("//li[@id='link1']");
	
	
   
   public void SignUPapplication(String Log,String Pwd){
	  
	   
	 LoginID.sendKeys(Log);
	 Password.sendKeys(Pwd);
	 Login.click();
	    }
	
   
	public void verifyMyOrder(){
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(MyOrder));
		String Text=ele.getText();
		Assert.assertEquals(Text,"My Orders","Signout Link Not Verified Properley");
		
	}

}
