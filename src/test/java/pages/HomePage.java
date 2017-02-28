package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public  HomePage(WebDriver ldriver){
		
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//a[text()='Sign In']") WebElement SignINLink;
	@FindBy(xpath="//a[text()='Log In']") WebElement LogINLink;
	@FindBy(xpath="//a[text()='CART']") WebElement CARTLnk;
@FindBy(xpath="	//a[text()='Track Order']") WebElement TrackOrderLink ;

public void clickonSignINLink(){
	SignINLink.click();
}

public void clickonLogInLink(){
	 LogINLink.click();
}

public void clickonCaRTLitnk(){
	CARTLnk.click();
}
public void clickonTrackOrderLink(){
	TrackOrderLink.click();
}

public String ApplicationgetTitle(){
	
	return driver.getTitle();

}

}
