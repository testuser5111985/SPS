package basepakg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {

public ChromeDriver driver;
public Properties pr;

@BeforeMethod
public void base() throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	File f=new File("C:\\Users\\smrati.rai\\git\\SPS\\SPS\\Testng\\OR.properties");
	FileInputStream fi=new FileInputStream(f);
	 pr=new Properties();
	pr.load(fi);
	
	}

/*@AfterMethod
public void close1() {
	driver.close();
}*/

}
