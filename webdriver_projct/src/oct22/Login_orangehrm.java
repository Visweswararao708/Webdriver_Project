package oct22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_orangehrm {

	public static void main(String[] args) throws Throwable  {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
// launch url
driver.get("http://orangehrm.qedgetech.com/");
Thread.sleep(5000);
// login application
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
driver.quit();
}

}
