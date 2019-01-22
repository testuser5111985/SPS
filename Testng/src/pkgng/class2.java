package pkgng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import basepakg.baseclass;

public class class2 extends baseclass {
	
	@Test
	public void subs() throws InterruptedException 
	{
	WebElement Subscriptions=driver.findElement(By.xpath("//span[text()='Subscriptions']"));
	Subscriptions.click();
	}
	}
