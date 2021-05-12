package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	 WebElement ref2 = driver.findElement(By.name("q"));
	 ref2.sendKeys("selenium");
	 //asecond method
	 ref2.sendKeys(Keys.ARROW_DOWN);//do it multiple times upto what constent we want
	 
	List<WebElement> ref= driver.findElements(By.xpath(".//span[text()='selenium']"));
	Thread.sleep(8000);
	int q=ref.size();
	Thread.sleep(7000);
	System.out.println("the size of the list"+""+q);
	String tst = "";
	/*
	 List<WebElement> ref= driver.findElements(By.xpath(".//span[contains(text(),'selenium')]"));
	 */
	for(int i=0;i<ref.size();i++)
	{
		String str = ref.get(i).getText();
		if(str.contains(tst))
		{
			ref.get(i).click();
			break;
		}
		
		
		
	}
	
	
	
	

	}

}
