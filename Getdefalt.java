package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getdefalt {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.fatcow.com");
		WebElement s = d.findElement(By.id("countrySelect"));
		
		//TO GET THE DEAFAULT SELECTED OPTION AS OUTPUT
		Select s2=new Select(s);
		WebElement rv = s2.getFirstSelectedOption();
		System.out.println(rv.getText());
		
		
		//IDENTIFIED ELELMENT PRINT AS OUTPUT
		s2.selectByIndex(3);
		
		s.click();
		
		List<WebElement> s1 = d.findElements(By.xpath(".//option"));
		for(int i=0;i<s1.size();i++)
		{
			String str=s1.get(i).getText();
			System.out.println(str);
		}

	}

}