package pkgng;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import basepakg.baseclass;
import pages.loginclass;
import utilities.log_file;
public class class1
{
@Test
public void trending() throws InterruptedException, IOException {
	/*loginclass lc=new loginclass(driver, pr);
	lc.login("smrati.511@gmail.com","smratirai511");
	log_file.takelog("tc1", "login successfull");
	WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
			
trending.click();*/
log_file.takelog("class1", "passed sucessfully");
}
}


