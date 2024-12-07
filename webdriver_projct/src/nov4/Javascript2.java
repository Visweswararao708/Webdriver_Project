package nov4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript2 {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.location'https://amazone.com,'");
Thread.sleep(2000);
// scroll top to bottom vertically
js.executeScript("window.scrollTO(0,document.body.scrollHeight)");
Thread.sleep(2000);
//scroll bottom to top vertically
js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,1000)");
Thread.sleep(2000);
driver.quit();


	}

}
