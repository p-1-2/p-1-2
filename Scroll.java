package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		
		WebElement str = d.findElement(By.xpath("(//div[@class='_4rR01T'])[9]"));
		str.getLocation().getX();
		str.getLocation().getY();
		
		/*d.get("https://www.fllipcart.com");
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		for(int i=1;i<=5;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		}*/
	}
	
}