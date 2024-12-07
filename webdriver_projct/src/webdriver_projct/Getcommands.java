package webdriver_projct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 // launch url
 driver.get("https:/google.com");
 Thread.sleep(5000);

	}

}
