package webdriver_projct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oct18 {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
//launch url in browser
driver.get("https:/tatacliq.com");
//suspend tool from excution
Thread.sleep(5000);
// print page title and length of title
String pagetitle = driver.getTitle();
System.out.println(pagetitle);
System.out.println(pagetitle.length());
// print url and length of url
String pageurl = driver.getCurrentUrl();
System.out.println(pageurl);
System.out.println(pageurl.length());
driver.quit();

	}

}
