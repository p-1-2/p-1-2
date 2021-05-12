package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver dp=new FirefoxDriver();
		dp.get("https://www.yatra.com");
		//WebElement target = dp.findElement(By.partialLinkText("Support"));
		WebElement target1 = dp.findElement(By.xpath("(//img)[4]"));
		Actions a=new Actions(dp);
		a.moveToElement(target1).perform();
		a.contextClick().perform();
		
		
		// TODO Auto-generated method stub

	}

}
