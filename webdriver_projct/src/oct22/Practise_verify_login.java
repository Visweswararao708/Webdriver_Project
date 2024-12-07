package oct22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise_verify_login {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http:orangehrm.qedgetech.com/");
Thread.sleep(5000);
// login in to application
driver.findElement(By .id("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#.");
driver.findElement(By.id("btnLogin")).click();
String Expected = "dashboard";
String Actual = driver.getCurrentUrl();
if (Actual.contains(Expected))
{
	System.out.println("logi sucess"+Expected+"     "+Actual);
}
else {
// capture error message using get text
String Errormessage = driver.findElement(By.id("spanMessage")).getText();
System.out.println(Errormessage+"     "+Expected+"     "+Actual);
}
Thread.sleep(5000);
driver.quit();
	}

}
