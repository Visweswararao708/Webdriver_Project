package nov2;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://google.com");
Thread.sleep(3000);
// create object for action class
Actions ac = new Actions(driver);
driver.findElement(By.name("q")).sendKeys("selenium openings in ");
// press down arrow for three times
ac.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
// click enter key
ac.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
driver.quit();
	}

}
