package seleniumtest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrip {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("document.getElementsByClassName('gLFyf gsfi')[0].value='google'");
		
		

	}

}
