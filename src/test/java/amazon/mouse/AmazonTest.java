package amazon.mouse;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AmazonTest {

	
@Test
public void Mouse(){
	
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");   
WebDriver driver=new ChromeDriver();  
driver.get("https://www.amazon.in/");
Actions a=new Actions(driver);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
driver.findElement(By.xpath("//span[text()='Your Account']")).click();
driver.close();


}
}