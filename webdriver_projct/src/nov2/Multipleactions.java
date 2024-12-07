package nov2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipleactions {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
// create object for actions class
Actions ac = new Actions(driver);
// mouse hover to electronics
ac.moveToElement(driver.findElement(By.xpath(""))).perform();
Thread.sleep(2000);
// mouse hover all and click all
ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
Thread.sleep(2000);
// mouse hover to baby and kids
ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
Thread.sleep(2000);
//mouse over to baby food and click 
ac.moveToElement(driver.findElement(By.xpath("//a[@class='jBYtJt'][normalize-space()='Baby Food']"))).perform();
Thread.sleep(2000);
driver.quit();

	}

}
