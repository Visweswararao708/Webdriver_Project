package nov2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Keyboard_and_mouseevents {

	private static String items;

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://gmail.com");
Thread.sleep(3000);
// create object for action class
Actions ac = new Actions(driver);
// take mouse hover to create account
ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']"))).click().perform();
Thread.sleep(2000);
// press up arrow for 3 times
ac.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(2000);
// click enter key
ac.sendKeys(Keys.ENTER).perform();
// enter first name
driver.findElement(By.name("firstName")).sendKeys("testing");
ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Next']"))).click().perform();
Thread.sleep(2000);
Select monthlist = new Select(driver.findElement(By.id("month")));
List<WebElement> all_items = monthlist.getOptions();
int items = all_items.size()-1;
System.out.println("no of items are:::"+items);
for (WebElement each : all_items)
{
	System.out.println(each.getText());
	}
Thread.sleep(2000);
driver.quit();



	}

}
