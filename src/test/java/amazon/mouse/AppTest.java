package amazon.mouse;

import java.time.Duration;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{

    @Test
    public void Table()
    {
     		
    			 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");  
    	           WebDriver driver=new ChromeDriver();  
    			    driver.get("https://www.w3schools.com/html/html_tables.asp");
    			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                    JavascriptExecutor js=(JavascriptExecutor)driver;
                    js.executeScript("window.scrollBy(0,400)");
                       Scanner sc=new Scanner(System.in);
                       System.out.println("enther the row");
                       int row=sc.nextInt();
                       System.out.println("enther the column");
                       int column=sc.nextInt();
    			    int rowCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();  
    			    for (int i=1;i<=rowCount;i++){  
    			      int columnCount =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td")).size();  
    			       for(int j=1;j<=columnCount;j++){  
    			    	   if(row<=rowCount||column<=columnCount) 
    			    	   {
    			    	   if(i==row&&j==column) {
    			         WebElement element =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));  
    			         System.out.println("The Specified values is"+':'+element.getText());
    			         } }
    			       }   
    			        
    			     }
    			    
    			      driver.quit();  

    		}
    }
