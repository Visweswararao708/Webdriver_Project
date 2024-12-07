package webdriver_projct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Oct19 {

	public static void main(String[] args) throws Throwable  {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
//launch url
driver.get("http://google.com");
//suspend tool for 5 seconds
Thread.sleep(5000);
String Expected_title = "google";
String Actual_title = driver.getTitle();
// verify runtime title with expected title
if (Actual_title.equalsIgnoreCase(Expected_title)) 
{
	System.out.println("title is matching:::"+Expected_title+"      "+Actual_title);
	
}
else
{
	System.out.println("title is not matching:::"+Expected_title+"      "+Actual_title);
	
}
driver.quit();

	


	


	}

}
