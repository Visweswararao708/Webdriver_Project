package oct28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlert1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
Thread.sleep(4000);
// click signin
driver.findElement(By.name("proceed")).click();
// capture alert message
String alert_text = driver.switchTo().alert().getText();
System.out.println(alert_text);
Thread.sleep(4000);
// click ok button in alert window
driver.switchTo().alert().accept();
Thread.sleep(2000);
driver.quit();
}

}
