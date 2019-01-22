package pkgng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import basepakg.baseclass;
public class class1 extends baseclass
{
@Test
public void trending() throws InterruptedException {
	
	WebElement trending=driver.findElement(By.xpath("//span[text()='Trending']"));
trending.click();
}
}

