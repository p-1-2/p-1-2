package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expdate {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver d=new FirefoxDriver();
	d.get("https://www.cleartrip.com/");
	d.findElement(By.xpath("(//div[@class='span span15 datePicker'])[1]")).click();
	String disp = d.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]//span[@class='ui-datepicker-month']")).getText();
	System.out.println(disp);
	String expm="August";
	
	while(true)
	{
		String disp1 = d.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]//span[@class='ui-datepicker-month']")).getText();
		Thread.sleep(2000);
		if(expm.contains(disp1))
		{
			System.out.println("match found");
			break;
		}
		else
		{
			d.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[@class='monthBlock last']/div/a")).click();
		}
	}
	
	}
}
