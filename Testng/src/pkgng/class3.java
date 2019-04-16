package pkgng;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import basepakg.baseclass;

public class class3 extends baseclass {

	@Test
	public void play() throws InterruptedException 
	{
		WebElement signin=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signin.click();
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("smrati.511@gmail.com");
		WebElement next=driver.findElement(By.xpath("//*[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(5000);
		WebElement pwd=driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("smratirai511");
		Thread.sleep(5000);
		WebElement next1=driver.findElement(By.xpath("//span[text()='Next']"));
		next1.click();
		Thread.sleep(5000);	
	List<WebElement> list=driver.findElements(By.id("video-title"));
	list.get(3).click();
	}
	}
