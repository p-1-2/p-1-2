package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewTest {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://impactguru:8nvbil51pp@staging.igstg.com/?redirect_url=%2Ffundraiser%2Fhelp-testdocumentchecklist");
		driver.findElement(By.xpath(".//button[text()='Username/Password']")).click();
		driver.findElement(By.id("username")).sendKeys("candidate");
		driver.findElement(By.id("password")).sendKeys("igcandidate");
        driver.findElement(By.id("submit")).click();
        //driver.get("https://ussername:pass@staging.igstg.com/?redirect_url=%2Ffundraiser%2Fhelp-testdocumentchecklist");
       Thread.sleep(10000);
      // driver.findElement(By.className("close exit-pop-up__close-btn fr-modal__close-btn btn-circle btn-sm"));
       driver.findElement(By.id("cmp-nfr-top-side-donate")).click();
       driver.findElement(By.id("story-popup-donate-amt-option2")).click();
       driver.findElement(By.id("full_name")).sendKeys("pradeep");
       driver.findElement(By.id("email_receipt")).sendKeys("pradeep@gmail.com");
       driver.findElement(By.id("mobile")).sendKeys("1234567891");
       driver.findElement(By.id("city_text")).sendKeys("banglore");
       driver.findElement(By.id("story-popup-donate-button")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("cardNumber")).sendKeys("5555555555554444");
       driver.findElement(By.id("expiryDate")).sendKeys("06/26");
       driver.findElement(By.id("cvvNumber")).sendKeys("236");
       driver.findElement(By.id("donate-card-contribute")).click();
       //driver.findElement(By.id("expiryDate")).sendKeys("06/26");
       

        
    
      
        
	}

}
