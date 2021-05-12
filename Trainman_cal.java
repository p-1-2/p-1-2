package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trainman_cal {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.trainman.in/");
		d.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c85-2']")).click();
		//d.findElement(By.xpath("//table//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")).clear();
		//String str1=d.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).getText();
		//System.out.println(str1);
		String expected="June";
		while(true)
		{
			String str=d.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).getText();
			Thread.sleep(3000);
			System.out.println(str);
			Thread.sleep(2000);
			if(expected.contains(str))
			{
				System.out.println("match found");
				break;
				
			}
			else
			{
				d.findElement(By.xpath("//button[contains(@aria-label,'Next month')]")).click();
				
			}
		}
		

	}

}
