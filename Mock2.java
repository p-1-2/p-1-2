package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement d1 = d.findElement(By.className("_3704LK"));
		d1.sendKeys("iphone");
		d1.sendKeys(Keys.ENTER);
		List<WebElement> list = d.findElements(By.xpath(".//a[contains(text(),'iPhone')]"));
		int a=list.size();
		//Thread.sleep(4000);
		System.out.println("total results"+" " +a);
		/*for(int i=0;i<a;i++)
		{
			String str = list.get(i).getText();
			System.out.print(str);
	
		}
		/*for(int i=0;i<list.size();i++)
		{
			
			
		}*/
		
		
		
		
	}

}
