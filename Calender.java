package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.phptravels.net/home");
		d.findElement(By.id("checkin")).click();
		String Exmonth="September";
		Thread.sleep(2000);
		
		while(true)
		{
			String displayed_month = d.findElement(By.xpath("(//nav[@class='datepicker--nav'])[1]/div[2])")).getText();
		
		if(Exmonth.contains(displayed_month))
		{
			break;
		}
		else
		{
			d.findElement(By.xpath("(//nav[@class=\"datepicker--nav\"])[1]/div[3]")).click();
			
		}
		}
		

	}

}
