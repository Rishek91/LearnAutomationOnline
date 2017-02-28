package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	
	public static String CaptureScreenShot(WebDriver driver, String ScreenshotName){
		
		TakesScreenshot ts= (TakesScreenshot) driver ;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String destination="C:\\Users\\rishek.kumar\\Desktop\\JAVA\\com.learnautomation.hybridScreenshots"+ScreenshotName+System.currentTimeMillis()+"Png";
		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (IOException e) {
			
			System.out.println("Failed to capture screen shot "+e.getMessage());
		
		}
		
		return destination;
		
	}
}
