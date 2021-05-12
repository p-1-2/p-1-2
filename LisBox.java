package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LisBox {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("file:///C:/Users/Gaurav/Desktop/listbox.html");
		WebElement list = d.findElement(By.xpath("//select"));
		Select s = new Select(list);
		
		if(s.isMultiple())
		{
			System.out.println("list box is multi selectable");
		}
		else
		{
			System.out.println("not multi selectable");
		}
		System.out.println();
		List<WebElement> list1 = d.findElements(By.xpath("//option"));
		for(int i=0;i<list1.size();i++)
		{
			String str = list1.get(i).getText();
			System.out.println(str);
		}
		 List<WebElement> list2 = d.findElements(By.xpath("//option[contains(text(),'testing')]"));
		 for(int i=0;i<list2.size();i++)
			{
				String str = list1.get(i).getText();
				System.out.println(str);
			}
		 System.out.println();
		 List<WebElement> list3 = d.findElements(By.xpath("//option"));
		 for(int i=0;i<list3.size();i=i+2)
			{
				String str = list3.get(i).getText();
				System.out.println(str);
			}
		 List<WebElement> list5 = s.getAllSelectedOptions();
		 for(WebElement ev:list5)
		 {
			 String txt=ev.getText();
			 System.out.println(txt);
			 
		 }
		  
		  
		 
		 
		
	}

}
