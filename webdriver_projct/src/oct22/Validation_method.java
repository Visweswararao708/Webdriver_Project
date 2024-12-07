package oct22;

import java.lang.classfile.attribute.ModuleTargetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_method {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
// launch url
driver.get("https:google.com");
Thread.sleep(5000);
//capture gmail text in google page by using gettext method
String gmailtext = driver.findElement(By.linkText("Gmail")).getText();
System.out.println(gmailtext);
String gmailurl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
System.out.println(gmailurl);
driver.quit();

	}

}
