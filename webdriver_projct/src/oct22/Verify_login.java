package oct22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_login {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
// launch url
driver.get("http:orangehrm.qedgetech.com/");
Thread.sleep(5000);
//login to application
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
driver.findElement(By.name("Submit")).click();
String expected ="dashboard";
String actual = driver.getCurrentUrl();
if (actual.contains(expected))
{
	System.out.println("login sucessful::"+expected+"     "+actual);
}
else 
{
// capture error message using get text
String errormessage = driver.findElement(By.id("spanMessage")).getText();
System.out.println(errormessage+"     "+expected+"    "+actual);
}
Thread.sleep(5000);
driver.quit();



	}

}
