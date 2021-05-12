package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock1 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.fatcow.com");
		WebElement s = d.findElement(By.id("countrySelect"));
		s.click();
		List<WebElement> s1 = d.findElements(By.xpath(".//option"));
		for(int i=0;i<s1.size();i++)
		{
			String str=s1.get(i).getText();
			System.out.println(str);
		}

	}

}
