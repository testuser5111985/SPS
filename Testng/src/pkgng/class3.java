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
	List<WebElement> list=driver.findElements(By.id("video-title"));
	list.get(3).click();
	}
	}
