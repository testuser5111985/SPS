package basepakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {

public WebDriver driver;

@BeforeMethod
public void base() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
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
	}

/*@AfterMethod
public void close1() {
	driver.close();
}*/

}
