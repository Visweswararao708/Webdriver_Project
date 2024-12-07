package webdriver_projct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pagesource {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
// launch url
driver.get("https://facebook .com");
Thread.sleep(5000);
String pagesource = driver .getPageSource();
System.out.println(pagesource);
driver.quit();

	}

}
