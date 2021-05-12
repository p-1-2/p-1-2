package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expected_date {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("www.cleartrip.com");
		
		d.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table//tr[3]/td[7]"));
		
		
		

	}

}
