package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock3 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.cricbuzz.com/");
		d.findElement(By.id("live-scores-link")).click();
		d.findElement(By.xpath(".//a[@title='South Africa Legends vs Sri Lanka Legends 8th Match']")).click();
		d.findElement(By.cssSelector("a[text()=Scorecard]")).click(); 
	}

}
