package seleniumtest;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Screenshot {

	public static void main(String[] args) throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		//take screenshot
		 File loc=ts.getScreenshotAs(OutputType.FILE);
		String src="../selenium/image/selenium1";
		File d=new File(src);
		//copy
		FileUtils.copyFile(loc, d);
		
		
		

	}

}
