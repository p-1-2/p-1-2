package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("http://www.fatcow.com");
	    WebElement m = d.findElement(By.id("countrySelect"));
	    WebElement m2 = d.findElement(By.id("month"));
	     m.click();
		Select r= new Select(m);
				//r.selectByIndex(3);
		Thread.sleep(5000);
		r.selectByValue("AUD");
		//r.s

	}

}
