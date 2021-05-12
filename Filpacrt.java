package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filpacrt {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flipcart.com");
		d.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("document.getElementsByClassName('_3704LK')[0].value='iphone'");
		
		

	}

}
