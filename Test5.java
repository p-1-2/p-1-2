package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
	    WebElement m = d.findElement(By.xpath(".//a[(@data-testid='open-registration-form-button')]"));
	    m.click();
	    Thread.sleep(3000);
	    WebElement m2 = d.findElement(By.id("month"));
	    Thread.sleep(2000);
	    m2.click();
	    Select s = new Select(m2);
	    
	    List<WebElement> List = s.getOptions();
	    int a=List.size();
	     for(int i=0;i<List.size();i++)
	     {
	    	 String str = List.get(i).getText();
	    	 System.out.println(str);
	     }
	    
	    System.out.println("size of the;"+""+a);
	    
	    /*  WebElement m = d.findElement(By.id("month"));
	     m.click();
		Select r= new Select(m);
				//r.selectByIndex(3);
		Thread.sleep(5000);
		r.selectByValue("AUD");
		//r.s*/

	}

}
