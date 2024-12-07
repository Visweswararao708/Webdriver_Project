package oct28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise_handleAlert1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new FirefoxDriver();
driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
Thread.sleep(2000);
//click signin
driver.findElement(By.name("proceed")).click();
// capture alert message
String alert_message = driver.switchTo().alert().getText();
System.out.println(alert_message);
Thread.sleep(2000);
// click on ok button
driver.switchTo().alert().accept();
Thread.sleep(2000);
driver.quit();




	}

}
