package Oct19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyUrl {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://gmail.com");
Thread.sleep(5000);
String Expected = "https://";
// get url in runtime
String Actual = driver.getCurrentUrl();
// verify actual starts with expected
if (Actual.startsWith(Expected))
{
	System.out.println("uri is secured:::"+Expected+"    "+Actual);
	
}
else
{
	System.out.println("uri is not secured::::"+Expected+"      "+Actual);
}
driver.quit();
	}

}
