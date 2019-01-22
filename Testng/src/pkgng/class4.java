package pkgng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepakg.baseclass;

public class class4 extends baseclass {

	@Test
	public void like() throws InterruptedException 
	{
	List<WebElement> list=driver.findElements(By.id("video-title"));
	list.get(3).click();
	Thread.sleep(10000);
	List<WebElement> like=driver.findElements(By.id("button"));
	like.get(3).click();
	}
	}
